package com.app04;

public class MainApp04 {

    public static void main(String[] args) {
        try{
            /*int[] data = new int[3];
            System.out.println("Start!!!");
            int value = data[10];
            System.out.println("Finish!!! value="+value);*/

            String s = null;
            s.hashCode();

        } catch (Throwable ex){
            System.out.println("------Throwable ex-----");
            System.out.println("------Throwable class="+ex.getClass());
            String errorMessage = ex.getMessage();
            System.out.println("------Throwable errorMessage="+errorMessage);
        }
    }

}
