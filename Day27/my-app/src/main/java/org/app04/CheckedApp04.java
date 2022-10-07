package org.app04;

import org.app03.MyFileContentReader;

import java.io.File;
import java.io.FileNotFoundException;

public class CheckedApp04 {


    public static void main(String[] args) {
        File file = new File("Denys2.txt");
        MyFileContentReader myFileContentReader = new MyFileContentReader();
        try {
            String content = myFileContentReader.readContentOfFile(file);
            System.out.println("content=" + content);
        } catch (Exception ex){
            ex.printStackTrace();
            System.out.println("------------FileNotFoundException");
        }

    }

}
