package web.service;

import model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {

    private  List<Car> carsList = new ArrayList<>();
    {
        carsList.add(new Car(1, "BMW", "black"));
        carsList.add(new Car(2, "Skoda", "red"));
        carsList.add(new Car(3, "Toyota", "red"));
        carsList.add(new Car(4, "Subaru", "blue"));
        carsList.add(new Car(5, "Honda", "brown"));

    }
    @Override
    public List<Car>getCarsList(){
        return carsList;
    }

    @Override
    public List<Car> carCount(List<Car> carList, int count) {
        if (count == 0 || count>5) return carList;
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
