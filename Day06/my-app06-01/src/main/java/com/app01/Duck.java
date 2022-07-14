package com.app01;

public class Duck extends Bird {

    @Override
    public void eat() {
        System.out.println("Duck.eat()");
        super.eat();
    }


}
