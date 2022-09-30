package com.app01;

import java.io.File;
import java.util.*;

public class FileSearcher {


//recursion - call itself
    public List<File> findFiles(File directory, String searchCriteria){
        System.out.println("directory"+directory);
        List<File> resultList = new ArrayList();
        if(directory.isDirectory()){
            File[] filesInDirectory = directory.listFiles();
            //check that directory has inside some files
            if(filesInDirectory!=null && filesInDirectory.length>0){
                for(File currentFile: filesInDirectory){
                    //check that file is not a directory/folder;
                    //check currentFile is file, not directory
                    if(!currentFile.isDirectory()){
                        if(currentFile.getName().endsWith(searchCriteria)){
                            resultList.add(currentFile);
                        }
                    } else {
                        //find files in sub directory
                        // directory/currentfile
                        //check fileis inside directory currentFile
                        List<File> subFolderResult = findFiles(currentFile, searchCriteria);
                        resultList.addAll(subFolderResult);
                    }
                }
            }
        }
        return resultList;
    }


}
