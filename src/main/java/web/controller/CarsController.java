package web.controller;

import Service.CarService;
import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("cars")
public class CarsController {


    @GetMapping()
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "toyota", "red"));
        cars.add(new Car(2, "skoda", "blue"));
        cars.add(new Car(3, "mersedes", "black"));
        cars.add(new Car(4, "ferrari", "yellow"));
        cars.add(new Car(5, "volvo", "white"));
        cars = CarService.CarCount(cars, allCars);
        model.addAttribute("cars",cars);
        return "cars";

    }

}
