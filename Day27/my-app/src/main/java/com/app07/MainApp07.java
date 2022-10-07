package com.app07;

public class MainApp07 {

    public static void main(String[] args) {
        try{
            //String s = null;
            //s.hashCode();

            //int[] data = new int[3];
            //int value = data[10];

            //NumberFormatException
            String text = "123TERT";
            int a = Integer.parseInt(text);
            System.out.println("a="+a);

        }catch (NullPointerException ex1){
            System.out.println("#####NullPointerException");
        } catch (ArrayIndexOutOfBoundsException ex2){
            System.out.println("@@@@@ArrayIndexOutOfBoundsException");
        } catch(Exception ex){
            System.out.println("catch exception");
            ex.printStackTrace();
            /*
            java.lang.NumberFormatException: For input string: "123TERT"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at com.app07.MainApp07.main(MainApp07.java:14)
             */
        }
    }

}
