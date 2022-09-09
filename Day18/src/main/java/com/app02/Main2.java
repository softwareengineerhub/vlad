package com.app02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {

    //List:
    //1) ArrayList
    //2) LinkedList
    //add(object) - add to the end
    //Object item= get(i) - return i item
    //Object old= set(i, Object) - replaces  value on i position; new Value is Object; Also return Object with oldValue in this position
    //remove(i) - removes item in position i
    //clear() - remove all items
    //boolean isEmpty()--> true is size==0
    //int size()--> ~array.length --> returns current amount/count/ size of items in List

    public static void main(String[] args) {
        //int[] array = new int[3];
        //array[0]=1;
        //array.length;

        ArrayList data = new ArrayList();
        //LinkedList data = new LinkedList();
        System.out.println("isEmpty="+data.isEmpty());

        data.add(0);
        data.add(1);
        data.add(2);
        System.out.println(data);
        int n = data.size();
        System.out.println("size="+n);
        boolean isEmpty = data.isEmpty();
        System.out.println("isEmpty="+isEmpty);
        data.add(3);
        System.out.println(data);
        System.out.println("-----Get data from list------------");
        //int a = array[3];
        Object item = data.get(0);
        System.out.println("item="+item);
        item = data.get(1);
        System.out.println("item="+item);
        // get last item
        int size = data.size();
        item = data.get(size-1);
        System.out.println("last item="+item);
        System.out.println("-----update/ replace---------------------");
        Object oldValue = data.set(0, 20);
        System.out.println(data);
        System.out.println("oldValue="+oldValue);
        oldValue = data.set(0, 50);
        System.out.println(data);
        System.out.println("oldValue="+oldValue);
        System.out.println("-----remove---------------------");
        data.remove(0);
        System.out.println(data);
        System.out.println("-----remove all---------------------");
        data.clear();
        System.out.println(data);
        System.out.println("----------------------");
        data.add("a");
        data.add("b");
        data.add("c");
        data.add("d");
        data.add("d");
        data.add("d");
        for(int i=0;i<data.size();i++){
            Object currentItem = data.get(i);
            System.out.println(i+"="+currentItem);
        }
    }

}
