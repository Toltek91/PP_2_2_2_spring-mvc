package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImp;


import java.util.List;

@Controller
@RequestMapping("cars")
public class CarController {
    private CarServiceImp carServiceImp;

    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping()
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> carList = carServiceImp.getCarlist();
        carList = carServiceImp.carCount(carList, allCars);
        model.addAttribute("cars", carList);
        return "cars";

    }

}
