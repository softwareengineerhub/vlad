package com.app06;

import com.app05.MyRecursionWithStackOverFlow;

public class MainApp06 {

    public static void main(String[] args) {
        try{
            //RuntimeException: ArrayIndexOutofBoundsException
            /*int[] data = new int[3];
            System.out.println("Start!!!");
            int value = data[10];
            System.out.println("Finish!!! value="+value);*/

            //RuntimeException: NullopinterException
            String s = null;
            s.hashCode();

            //Error: StackOverflowError
            MyRecursionWithStackOverFlow item = new MyRecursionWithStackOverFlow();
            item.searchFile();

        } catch (Error err){
            System.out.println("Error catch()");
        }catch (Exception ex){
            System.out.println("Exception catch()");
        } catch (Throwable th){
            System.out.println("------Exception ex-----");
            System.out.println("------Exception class="+th.getClass());
            String errorMessage = th.getMessage();
            System.out.println("------Exception errorMessage="+errorMessage);
        }
    }

}
