package org.app03;

import java.io.File;
import java.io.FileNotFoundException;

public class CheckedApp03 {


    public static void main(String[] args) {
        File file = new File("Denys2.txt");
        MyFileContentReader myFileContentReader = new MyFileContentReader();
        try {
            String content = myFileContentReader.readContentOfFile(file);
            System.out.println("content=" + content);
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
            System.out.println("------------FileNotFoundException");
        }

    }

}
