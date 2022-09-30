package com.app01;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main01 {

    public static void main(String[] args) {
        FileSearcher fileSearcher = new FileSearcher();
        File directory = new File("D:\\Task");
        List<File> resultList = fileSearcher.findFiles(directory,".txt");
        System.out.println("--------result---------------");
        System.out.println("size="+resultList.size());
        for(File fileItem: resultList){
            System.out.println(fileItem);
        }
    }

}
