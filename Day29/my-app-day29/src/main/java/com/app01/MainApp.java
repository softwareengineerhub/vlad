package com.app01;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainApp {


    public static void main(String[] args) {
        File carFile = new File("car.txt");
        Car car = new Car();
        car.age=1;
        car.name="Car1";

        DataHelper dataHelper = new DataHelper();
        System.out.println("-------write car-----");
        dataHelper.write(car, carFile);
        System.out.println("-------read car-----");
        Car resultCar = dataHelper.read(carFile);
        System.out.println(resultCar);

        System.out.println("---write list of cars-------------");
        List<Car> cars = new ArrayList<>();

        Car c1 = new Car();
        c1.name="mycar1";
        c1.age=1;

        Car c2 = new Car();
        c2.name="mycar2";
        c2.age=2;

        Car c3 = new Car();
        c3.name="mycar3";
        c3.age=3;

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);

        File carsFile = new File("cars.txt");
        dataHelper.writeCars(cars, carsFile);

        List<Car> carsListResult = dataHelper.readCars(carsFile);
        System.out.println(carsListResult);

    }

}
