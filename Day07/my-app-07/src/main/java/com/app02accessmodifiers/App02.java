package com.app02accessmodifiers;

public class App02 {


    public static void main(String[] args) {
        Phone p1 = new Phone();

        //private
        //p1.model="TEST";
        int price = p1.calulatePrice();
        System.out.println("price="+price);

        //default
        p1.weight=20;
        p1.printWeight();

        //protected
        p1.color="White";
        p1.printColor();


        p1.call();
        p1.sms();







    }

}
