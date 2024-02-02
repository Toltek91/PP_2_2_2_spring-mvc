package web.service;

import model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarsList();

    List<Car> carCount(List<Car> carList, int count);
}


