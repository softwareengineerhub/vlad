package com.app03.accessmodifiers;

import com.app02accessmodifiers.Phone;

public class MobilePhone extends Phone {

    public void createColor(String colorValue){
        color=colorValue;
    }

    public void call(){
        System.out.println("MobilePhone.call()");
    }

    public void parentCall(){
        super.call();
        sms();
    }

    public void sms(){
        System.out.println("MobilePhone.call()");
    }

    public void alarm(){
        System.out.println("MobilePhone.alarm()");
    }

    public void makePhoto(){
        System.out.println("Phone.makePhoto()");
    }








}
