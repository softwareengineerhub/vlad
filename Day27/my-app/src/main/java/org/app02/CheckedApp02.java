package org.app02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedApp02 {


    public static void main(String[] args) {
        File file = new File("Denys.txt");
        MyFileContentReader myFileContentReader = new MyFileContentReader();
        String content = myFileContentReader.readContentOfFile(file);
        System.out.println("content="+content);

    }

}
