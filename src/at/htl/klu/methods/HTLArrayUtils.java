package at.htl.klu.methods;

import java.util.Random;

public class HTLArrayUtils {
    public static int [] getRandomArray(int length, int min, int max){
        int [] arr = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr [i]= rnd.nextInt(min,max+1);
        }
        return arr;
    }

    public static int getMin (int [] arr){

    }



}
