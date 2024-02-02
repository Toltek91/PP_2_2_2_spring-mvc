package service;

import model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarlist();

    List<Car> carCount(List<Car> carList, int count);
}


