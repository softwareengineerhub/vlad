package coma.app02.revert;

import com.app01.swap.Main;

import java.util.Arrays;

public class Main02 {

    public static void main(String[] args) {
        int[] data = {10,7,1,4,2,0};
        System.out.println("Before revert");
        System.out.println(Arrays.toString(data));
        revert(data);
        System.out.println("After revert");
        System.out.println(Arrays.toString(data));
    }

    public static void revert(int[] data){
        for(int i=0;i<data.length/2;i++){
            int j = data.length-1-i;
            Main.swap(data, i, j);
        }

        /*
        data.length = 6;
        i=0;
        data[5]=data[length-1]
        for
        i = 0;
        j =



         */
    }

}
