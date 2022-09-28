package com.app02;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearcher {

    public List<File> searchForFile(String directory, String searchCriteria){
        List<File> resultList = new ArrayList<>();
        File file = new File(directory);
        //check that we are working with folder/directory
        if(file.isDirectory()){
            //files inside folder
            File[] files = file.listFiles();
            for(File item: files){
                String itemName = item.getName();
                if(itemName.endsWith(searchCriteria)) {
                    resultList.add(item);
                }
            }
        }
        return resultList;
    }

}
