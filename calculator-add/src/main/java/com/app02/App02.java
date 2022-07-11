package com.app02;

public class App02 {

    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.add(2,3);
        int addRes = simpleCalculator.add(40,15);
        System.out.println("addRes="+addRes);
        System.out.println("-----add asText---------");
        String textRes = simpleCalculator.addAsText(3, 7);
        System.out.println("textRes="+textRes);
        System.out.println("-----add asText2------------");
        String qqq = simpleCalculator.addAsText2(5, 9);
        System.out.println("qqq="+qqq);
    }

}
