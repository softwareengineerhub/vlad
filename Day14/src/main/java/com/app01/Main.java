package com.app01;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------------for---------------");
        for(int i=0;i<5;i++){
            System.out.println("i="+i);
        }

        System.out.println("---------------while---------------");
        int i = 0;
        while(i<5){
            System.out.println("i="+i);
           // i++;
            if(i==2){
                break;
            }
        }



    }

}
