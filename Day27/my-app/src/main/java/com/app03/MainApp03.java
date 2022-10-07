package com.app03;

public class MainApp03 {

    public static void main(String[] args) {
        try{
            int[] data = new int[3];
            System.out.println("Start!!!");
            int value = data[10];
            System.out.println("Finish!!! value="+value);
        } catch (NullPointerException ex){
            System.out.println("------NullPointerException ex-----");
        } catch (ArrayIndexOutOfBoundsException ex1){
            System.out.println("------ArrayIndexOutOfBoundsException ex1-----");
        } finally {
            System.out.println("--------finally---------");
        }
    }

}
