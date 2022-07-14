package com.app01;

public class Main {

    public static void main(String[] args) {
        Animal animalA = new Animal();
        animalA.eat();

        System.out.println("----------Cat--------------------");
        Cat catA = new Cat();
        catA.eat();
        catA.jump();
        catA.eat(10);

        System.out.println("----------Dog--------------------");
        Dog dogA = new Dog();
        dogA.eat();
        dogA.sound();
        dogA.eat(3);

        System.out.println("----------Bird--------------------");
        Bird birdA = new Bird();
        birdA.eat();
        birdA.eat(4);

        System.out.println("----------Elephant--------------------");
        Elephant elephantA = new Elephant();
        elephantA.eat();
        elephantA.eat("Banana");
        elephantA.eat(15);

        System.out.println("----------BritishCat--------------------");
        BritishCat britishCatA = new BritishCat();
        britishCatA.eat();
        britishCatA.eat(1);
        britishCatA.jump();

        System.out.println("-----------Bird2------------");
        Bird birdB = new Bird();
        birdB.eat();

        System.out.println("-----------Duck------------");
        Duck duckA = new Duck();
        duckA.eat();
        duckA.hashCode();

        System.out.println("---------Object------");
        Object objectA = new Object();
        int hash = objectA.hashCode();
    }

}
