package com.app;

public class MainApp {

    public static void main(String[] args) {
        DataHelper dataHelper = new DataHelper();
        System.out.println("----------write data------------");
        dataHelper.writeData2("This is Friday!!!");

        System.out.println("----------read data------------");
        String data = dataHelper.readData();
        System.out.println("data="+data);

    }

}
