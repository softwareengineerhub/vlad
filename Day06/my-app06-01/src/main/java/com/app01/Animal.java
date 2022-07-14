package com.app01;

public class Animal {

    public void eat(){
        System.out.println("Animal.eat()-->parent method!!!");
    }

    public void eat(int amount){
        System.out.println("Animal.eat(amount)-->amount="+amount);
    }


}
