package com.app01static;

public class Animal {
    public String name;
    public static int age;

    public void sleep(){
        System.out.println("Animal with name="+name+".sleep()");
    }

    public static void eat(){
        //System.out.println("Animal.eat() - static; name="+name);
        System.out.println("Animal.eat() - static");
    }

    public static void test(){
        //System.out.println("name="+name);
        System.out.println("age="+age);
    }


}
