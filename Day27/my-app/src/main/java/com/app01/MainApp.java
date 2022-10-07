package com.app01;

public class MainApp {

    public static void main(String[] args) {
        try {
            System.out.println("Start");
            //String text = "my test";
            String text = null;
            int hashCode = text.hashCode();
            System.out.println("End: text="+text+"; hashCode="+hashCode);
        } catch (NullPointerException ex){
            System.out.println("----NullPointerException ex----");
            ex.printStackTrace();
        }
    }

}
