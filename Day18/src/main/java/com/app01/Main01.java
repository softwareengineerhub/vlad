package com.app01;

public class Main01 {

    public static void main(String[] args) {
        String a = new String("my text");
        String b = new String("my text");
        boolean isSame = (a==b);
        boolean isEquals = a.equals(b);
        System.out.println("isSame="+isSame);
        System.out.println("isEquals="+isEquals);
        System.out.println("------------------");
        String x = "my text";
        String y = "my text";
        isSame = (x==y);
        isEquals = x.equals(y);
        System.out.println("isSame="+isSame);
        System.out.println("isEquals="+isEquals);
        System.out.println("------------------");
        String t1 = "test";
        String t2 = new String("test");
        isSame = (t1==t2);
        isEquals = t1.equals(t2);
        System.out.println("isSame="+isSame);
        System.out.println("isEquals="+isEquals);
        System.out.println("t1.hash="+t1.hashCode());
        System.out.println("t2.hash="+t2.hashCode());


    }

}
