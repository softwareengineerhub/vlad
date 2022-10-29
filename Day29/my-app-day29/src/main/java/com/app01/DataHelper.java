package com.app01;

import java.io.*;
import java.util.List;

public class DataHelper {

    //serialization - creation byte[] from Object
    public void write(Car car, File file){
        try(FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)){
            out.writeObject(car);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Car read(File file){
        try(FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(fileInputStream)
        ){
            /*Object result = in.readObject();
            Car carResult = (Car)result;
            return carResult;*/

            return (Car)in.readObject();

        } catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    public void writeCars(List<Car> cars, File file){
        try(FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)
        ){
            out.writeObject(cars);
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    public List<Car> readCars(File file){
        try(FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(fileInputStream)){
            return (List<Car>) in.readObject();
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

}
