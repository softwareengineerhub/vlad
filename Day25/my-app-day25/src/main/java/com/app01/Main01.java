package com.app01;

import java.io.File;
import java.util.Date;

public class Main01 {

    public static void main(String[] args) {
        File file = new File("D:\\MyFile.txt");
        System.out.println(file);
        boolean exists = file.exists();
        System.out.println("exists="+exists);
        String parent = file.getParent();
        System.out.println("parent="+parent);


        System.out.println("-----------file last modified-------------------");
        long lastModified = file.lastModified();
        //1664338977070 - amount milliseconds sine 1 January 1970
        //1 sec = 1000 milliseconds
        //1664338977 seconds since 1970

        System.out.println("lastModified as long ="+lastModified);
        System.out.println("lastModified="+new Date(lastModified));

        System.out.println("-----------date examples-------------------");
        Date currentDate = new Date();
        System.out.println("currentDate="+currentDate);
        long currentMilliseconds = currentDate.getTime();
        System.out.println("currentMilliseconds="+currentMilliseconds);

        int currentH = currentDate.getHours();
        System.out.println("currentH="+currentH);
        System.out.println("--------------------------------------------");
        String name = file.getName();
        System.out.println("name="+name);
        String absolutePath = file.getAbsolutePath();
        System.out.println("absolutePath="+absolutePath);

    }


}
