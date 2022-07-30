package com.app01;

public class App {

    public static void main(String[] args) {
        String result = defineType(15);
        System.out.println("result="+result);
        System.out.println("---------------switch----------------");
        String result2 = defineType2(100);
        System.out.println("result2="+result2);
    }

    private static String defineType(int points){
        String type = null;
        if(points == 100){
            type = "World Class";
        } else if(points>50){
            type = "Country Class";
        } else if(points>10){
            type = "Region Class";
        } else {
            type= "Amator";
        }
        return type;
    }

    private static String defineType2(int points){
        String type = null;
        switch (points){
            case 100:
                type = "World Class";
                break;
            case 60:
                type = "Country";
                break;
            case 10:
                type = "Region";
                break;
            default:
                type = "Amator";
        }
        return type;
    }

}
