package org.app02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyFileContentReader {

    public String readContentOfFile(File file){
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            //read content
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }

        return "test";
    }

}
