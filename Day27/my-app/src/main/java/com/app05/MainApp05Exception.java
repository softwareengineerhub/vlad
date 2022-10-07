package com.app05;

public class MainApp05Exception {

    public static void main(String[] args) {
        try{
            /*int[] data = new int[3];
            System.out.println("Start!!!");
            int value = data[10];
            System.out.println("Finish!!! value="+value);*/

            String s = null;
            s.hashCode();

        } catch (Exception ex){
            System.out.println("------Exception ex-----");
            System.out.println("------Exception class="+ex.getClass());
            String errorMessage = ex.getMessage();
            System.out.println("------Exception errorMessage="+errorMessage);
        }
    }

}
