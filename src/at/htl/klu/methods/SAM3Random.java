package at.htl.klu.methods;

import java.util.Arrays;
import java.util.Random;

public class SAM3Random {
    public static void main(String[] args) {

        Random rnd = new Random();
        int z = rnd.nextInt(1,51);
        System.out.println(z);

        int[] arr = new int[100-z];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= rnd.nextInt(z,101);

        }

        int [] test =Math.onlyEven(arr);
        int [] results = Math.mathArray(test);
        System.out.println(Arrays.toString(results));
    }
}
