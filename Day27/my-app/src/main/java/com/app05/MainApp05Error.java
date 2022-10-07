package com.app05;

public class MainApp05Error {

    public static void main(String[] args) {
        try{


            MyRecursionWithStackOverFlow item = new MyRecursionWithStackOverFlow();

            //makes Error: java.lang.StackOverflowError
            item.searchFile();

        } catch (Error ex){
            System.out.println("------Exception ex-----");
            System.out.println("------Exception class="+ex.getClass());
            String errorMessage = ex.getMessage();
            System.out.println("------Exception errorMessage="+errorMessage);
        }
    }

}
