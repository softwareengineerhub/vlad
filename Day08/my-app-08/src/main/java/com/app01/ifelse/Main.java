package com.app01.ifelse;

public class Main {

    public static void main(String[] args) {

        boolean flag1 = true;
        boolean flag2 = false;

        boolean isBigger = 10 > 15;
        System.out.println("isBigger=" + isBigger);

        boolean isLess = 10 < 15;
        System.out.println("isLess=" + isLess);

        //(-5; 5) ~ [-4; 4]
        //int value = 10;
        int value = -5;
        boolean isInside = -5<value && value<5;
        System.out.println("isInside="+isInside);

        System.out.println("--------------------------");
        boolean c1 = -5<value;
        boolean c2 = value<5;
        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        //all conditions should be done
        boolean andValue = c1 && c2;
        System.out.println("andValue="+andValue);
        //at least 1 condition should be done
        boolean orValue = c1 || c2;
        System.out.println("orValue="+orValue);

        System.out.println("------------==--------------");
        int t = 80;
        boolean isEqual = (t==10);
        System.out.println("isEqual="+isEqual);
        System.out.println("t="+t);

        System.out.println("------------<=--------------");
        int r = 6;
        boolean isLessOrEqual = r<=5;
        System.out.println("isLessOrEqual="+isLessOrEqual);
        System.out.println("r="+r);

        System.out.println("------------>=--------------");
        int e = 110;
        boolean isBiggerOrEqual = e>=10;
        System.out.println("isBiggerOrEqual="+isBiggerOrEqual);
        System.out.println("e="+e);

        System.out.println("----------IF(true)----------------");
        int age = 91;
        boolean isAdult = age >=18;
        /*
        if(isAdult==true){

        }
        */
        if(isAdult){
            System.out.println("Take your beer!!!");
        }

        System.out.println("----------IF(false)----------------");
        int price = 1000;
        boolean isCheap = price<=10;
        /*
        if(isCheap == false){
            System.out.println("We buy some not cheep goods!!!");
        }
        */
        if(!isCheap){
            System.out.println("We buy some not cheep goods!!!");
        }

        System.out.println("----------if(true) else----------------");
        int height = 180;
        boolean isToll = height > 175;
        if(isToll){
            System.out.println("You need to play basketball");
        } else {
            System.out.println("you are short!!!");
        }

    }


}
