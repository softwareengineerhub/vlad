package com.app02accessmodifiers;

public class Phone {

    private String model = "samsung";
    int weight = 10;
    protected String color;

    public int calulatePrice(){
        int price = 0;
        if("samsung".equals(model)){
            price = 1000;
        }
        return price;
    }

    public void printWeight(){
        System.out.println("weight="+weight);
    }

    public void printColor(){
        System.out.println("color="+color);
        call();
    }

    public void call(){
        System.out.println("Phone.call()");
    }

    protected void sms(){
        System.out.println("Phone.call()");
    }

    void makePhoto(){
        System.out.println("Phone.makePhoto()");
    }

    private void alarm(){
        System.out.println("Phone.alarm");
    }



}
