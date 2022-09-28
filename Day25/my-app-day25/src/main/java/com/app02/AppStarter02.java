package com.app02;

import java.io.File;
import java.util.List;

public class AppStarter02 {

    public static void main(String[] args) {
        String directory = "D:\\Task";
        String searchCriteria = ".txt";
        FileSearcher fileSearcher = new FileSearcher();
        List<File> resultList = fileSearcher.searchForFile(directory, searchCriteria);
        System.out.println("resultList.size()="+resultList.size());
        for(File file: resultList){
            System.out.println(file);
        }
    }

}
