package com.app01;

import java.io.Serializable;

public class Car implements Serializable {
    public String name;
    public int age;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
