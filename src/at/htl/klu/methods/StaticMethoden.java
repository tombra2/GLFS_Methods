package at.htl.klu.methods;

import java.util.Arrays;
import java.util.Random;

public class StaticMethoden {

    public static void main(String[] args) {



    


    }

    public static double CalcMissingEdge(int a, int b, int c) {
        if (a == 0 && b > 0 && c > 0) {
            return 0;
        } else if (a > 0 && b == 0 && c > 0) {
            return 0;
        } else if (a > 0 && b > 0 && c == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public static int[] createArray(int param) {
        int[] arr = new int[param];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = param;
        }
        return arr;

    }

    public static int[] fillRandomArray(int[] arr, int min, int max) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            int[] arr = rnd.nextInt(min, max);

        }

        return arr;


    }


    public static String generatePadding ( String str, char c ,int count, boolean right, int max) {
        String output = "";
        int length = str.length();

        if (right) {
            for (int i = 0; i < max-length; i++) {
                output += c;
            }
            output += str;
            return output;
        } else {
            for (int i = 0; i < max - length; i++) {
                output += c;
            }
            output += str;
            return output;
        }
    }}

