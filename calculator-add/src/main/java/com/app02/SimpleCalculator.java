package com.app02;

public class SimpleCalculator {

    public int add(int a, int b){
        System.out.println("add(); a="+a+"; b="+b);
        int sum = a+b;
       // System.out.println("sum="+sum);
        return sum;
    }

    public String addAsText(int a, int b){
        System.out.println("addAsText(); a="+a+"; b="+b);
        int sum = a+b;
        String res = sum+"";
        return res;
    }

    public String addAsText2(int a, int b){
        System.out.println("addAsText2(); a="+a+"; b="+b);
        int sum = a+b;
        return a+b+"";
    }


}
