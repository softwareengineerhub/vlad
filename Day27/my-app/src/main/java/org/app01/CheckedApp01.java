package org.app01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedApp01 {


    //Checked - you must use try catch
    public static void main(String[] args) {

        //RuntimeException - no need to write try-catch
        System.out.println("-----Runtime example:---");
        String text = "123";
        int a = Integer.parseInt(text);
        System.out.println("a="+a);


        System.out.println("-----Checked Exception example:---");
        //File file = new File("C:\\Users\\asusadmin\\Downloads\\Day19\\my-app\\Denys.txt");
        File fileCorrect = new File("Denys.txt");
        File fileError = new File("Denys2.txt");

        //CheckedException - must write try-catch --> otherwise code will not compile
        try {
            FileInputStream fileInputStream = new FileInputStream(fileCorrect);
            System.out.println("Read content of file");
        } catch (FileNotFoundException e) {
            System.out.println("-----FileNotFoundException");
            e.printStackTrace();
        }

    }

}
