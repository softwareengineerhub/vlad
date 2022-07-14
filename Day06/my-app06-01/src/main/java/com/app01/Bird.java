package com.app01;

public class Bird extends Animal {


    public void eat(){
        System.out.println("MyBird");
        super.eat();
    }


    /*public void eat(){
        super.eat();
        System.out.println("Bird.eat() - parent override");
       // Animal.eat();
    }*/


}
