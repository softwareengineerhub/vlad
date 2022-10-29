package com.app02;

import com.app01.Car;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AutoSalon implements Serializable {
    public String name;
    public List<Car> cars = new ArrayList();

}
