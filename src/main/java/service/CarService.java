package service;

import model.Car;

import java.util.List;
public interface CarService {
    List<Car> getList();

    List<Car> getListcount(List<Car> carList, int count);
}


