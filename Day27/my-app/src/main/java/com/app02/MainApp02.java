package com.app02;

import java.util.Arrays;

public class MainApp02 {

    public static void main(String[] args) {
        try {
            int[] data = {0, 1, 2, 3};
            System.out.println(Arrays.toString(data));
            int value = data[10];
            System.out.println("value=" + value);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("-----------ArrayIndexOutOfBoundsException ex-----------");
            //ex.printStackTrace();
        } finally {
            //common for try and catch
            //always executed after try or catch
            System.out.println("-----finally {}-----");
        }

    }

}
