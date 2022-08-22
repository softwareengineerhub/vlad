package com.example.myfxapp01;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printPerson(){
        System.out.println("name="+name+"; age="+age);
    }

    public String toString(){
        return "name="+name+"; age="+age;
    }
}
