package com.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class DataHelper {

    //out
    public void writeData(String text){
        File file = new File("denys.txt");
        FileOutputStream out = null;
        try {
            //FileNotFoundException
            out = new FileOutputStream(file);
            byte[] content = text.getBytes();

            //IOException
            out.write(content);

        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            try {
                if(out!=null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeData2(String text){
        File file = new File("denys.txt");
        //Autoclosable
        try(FileOutputStream out = new FileOutputStream(file)){

            //create byte[] from String
            byte[] content = text.getBytes();
            System.out.println("text="+text);
            System.out.println("byte[]="+ Arrays.toString(content));
            out.write(content);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    //in
    public String readData(){
        File file = new File("denys.txt");
        try(FileInputStream in = new FileInputStream(file)){
            int size = in.available();
            byte[] content = new byte[size];
            in.read(content);
            //create String from byte[]
            String text = new String(content);
            return text;
        }catch (Exception ex){
            ex.printStackTrace();
            //return null;
            //return "";
            throw new RuntimeException(ex);
        }


    }

    private void write(){
        File file = new File("test.txt");
        try(FileOutputStream out = new FileOutputStream(file)){

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


    private String read(){
        File file = new File("test.txt");
        try(FileInputStream in =new FileInputStream(file)){


            return "";
        }catch (Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }


}
