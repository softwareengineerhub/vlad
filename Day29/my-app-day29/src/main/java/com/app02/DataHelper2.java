package com.app02;

import java.io.*;

public class DataHelper2 {

    public void write(AutoSalon autoSalon, File file){
        try(FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)){

            out.writeObject(autoSalon);

        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    public AutoSalon read(File file){
        try(FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileInputStream)){

            return (AutoSalon) in.readObject();

        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

}
