package web.controller;

import web.service.CarServiceImp;
import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
@RequestMapping("cars")
public class CarController {
    CarServiceImp carServiceImp = new CarServiceImp();


    @GetMapping()
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> carList = carServiceImp.getCarsList();
        carList = carServiceImp.carCount(carList, allCars);
        model.addAttribute("cars", carList);
        return "cars";

    }

}
