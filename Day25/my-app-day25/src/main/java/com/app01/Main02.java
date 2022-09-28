package com.app01;

import java.io.File;
import java.util.Date;

public class Main02 {

    public static void main(String[] args) {
        File file = new File("D:\\Content");
        System.out.println(file);
        boolean exists = file.exists();
        System.out.println("exists="+exists);
        String parent = file.getParent();
        System.out.println("parent="+parent);
        String name = file.getName();
        System.out.println("name="+name);
        String absolutePath = file.getAbsolutePath();
        System.out.println("absolutePath="+absolutePath);
        System.out.println("--------check is dir------------");
        boolean isDirectory = file.isDirectory();
        System.out.println("isDirectory="+isDirectory);
        System.out.println("--------look inside dir------------");
        File[] files = file.listFiles();
        System.out.println("files.length="+files.length);
        for(int i=0;i<files.length;i++){
            File item = files[i];
            System.out.println(i+"="+item);
        }
    }


}
