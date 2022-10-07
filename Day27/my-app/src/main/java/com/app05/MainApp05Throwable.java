package com.app05;

public class MainApp05Throwable {

    public static void main(String[] args) {
        try{
            //RuntimeException: ArrayIndexOutofBoundsException
            /*int[] data = new int[3];
            System.out.println("Start!!!");
            int value = data[10];
            System.out.println("Finish!!! value="+value);*/

            //RuntimeException: NullopinterException
            String s = null;
            s.hashCode();

            //Error: StackOverflowError
            MyRecursionWithStackOverFlow item = new MyRecursionWithStackOverFlow();
            item.searchFile();

        } catch (Throwable ex){
            System.out.println("------Exception ex-----");
            System.out.println("------Exception class="+ex.getClass());
            String errorMessage = ex.getMessage();
            System.out.println("------Exception errorMessage="+errorMessage);
        }
    }

}
