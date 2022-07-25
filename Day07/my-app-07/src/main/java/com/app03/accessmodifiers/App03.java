package com.app03.accessmodifiers;

import com.app02accessmodifiers.Phone;

public class App03 {

    public static void main(String[] args) {
        Phone p1 = new Phone();
        //p1.model="TEST";
        //p1.weight=30;
        //p1.color="Black";
       // p1.sms();

        MobilePhone mp1 = new MobilePhone();
        //mp1.color="Green";
        mp1.createColor("Green");
        mp1.printColor();
        mp1.alarm();

    }
}
