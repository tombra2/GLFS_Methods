package at.htl.klu.methods;

import java.util.Arrays;

public class Calculations {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.getRandomInt(1, 100);
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }

        System.out.println(Arrays.toString(arr));
        int absValue = Math.getAbs(max - min);
        System.out.println(absValue);
    }
}
