package com.app02;

import com.app01.Car;
import com.app01.DataHelper;

import java.io.File;

public class MainApp02 {

    public static void main(String[] args) {
        AutoSalon autoSalon = new AutoSalon();
        autoSalon.name="my-auto-salon";

        Car bmw = new Car();
        bmw.name="bmw1";
        bmw.age=1;
        autoSalon.cars.add(bmw);

        Car audi = new Car();
        audi.name="audi2";
        audi.age=2;
        autoSalon.cars.add(audi);
        System.out.println("-----------write------------");
        File file = new File("autosalon.txt");
        DataHelper2 dataHelper2 = new DataHelper2();
        dataHelper2.write(autoSalon, file);

        AutoSalon result = dataHelper2.read(file);
        System.out.println(result.name);
        System.out.println(result.cars);


    }
}
