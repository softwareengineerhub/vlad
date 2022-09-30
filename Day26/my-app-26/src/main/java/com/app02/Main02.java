package com.app02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main02 {

    public static void main(String[] args) {
        //LinkedList<String> myData = new LinkedList();
        //ArrayList<String> myData = new ArrayList();

        List<String> myData = new LinkedList();

        myData.add("A");
        myData.add("B");
        System.out.println(myData.isEmpty());
        System.out.println(myData.size());
        //String lastItem = myData.getLast();
        int size = myData.size();
        String lastItem = myData.get(size-1);
        System.out.println("lastItem="+lastItem);
    }

}
