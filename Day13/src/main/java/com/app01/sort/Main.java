package com.app01.sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] data = {3,1,-66,7,-10};
        System.out.println("Before");
        System.out.println(Arrays.toString(data));
        sort(data);
        System.out.println("After");
        System.out.println(Arrays.toString(data));
    }


    public static void sort(int[] data){
        for(int i=0;i<data.length;i++){
            int min = data[i];
            int minIndex = i;
            for(int j = i+1;j<data.length;j++){
                if(data[j]<min){
                    minIndex = j;
                    min=data[j];
                }
            }
            if(minIndex!=i){
                swap(data, i, minIndex);
            }
        }
    }

    private static void swap(int[] data, int i , int j){
        data[i] = data[i]+data[j];
        data[j] = data[i]-data[j];
        data[i] = data[i]-data[j];
    }


    /*public static void sort(int[] data){
        for(int i=0;i<data.length;i++){
            System.out.println("i="+i);
            for(int j = i+1;j<data.length;j++){
                System.out.println("\tj="+j);
            }
            System.out.println("HERE");
        }
    }*/


}
