package at.htl.klu.methods;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Random;

public class Math {

    public static int getMin(int numa, int numb) {
        if (numa < numb) {
            return numa;
        } else {
            return numb;
        }
    }

    public static int getMax(int numa, int numb) {
        if (numa > numb) {
            return numa;
        } else {
            return numb;
        }
    }

    public static int getSum(int numa, int numb) {
        return numa + numb;
    }

    public static int getAbs(int numa) {
        if (numa < 0) {
            return -numa;
        } else {
            return numa;
        }
    }

    public static double getQuotient(int numa, int numb) {
        return (double) numa / numb;
    }

    public static boolean isEven(int numa) {
        return numa % 2 == 0;
    }

    public static int getRandomInt(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt(min, max);
    }

    public static double getRandomDouble(int min, int max) {
        Random rnd = new Random();
        return rnd.nextDouble(min, max);
    }

    public static boolean isADividedByB(int numa, int numb) {
        return numa % numb == 0;


    }


    public static int[] onlyEven(int[] arryWithNums) {
        int[] arr = new int[arryWithNums.length];
        for (int i = 0; i < arryWithNums.length; i++) {

            if (arryWithNums[i] % 2 == 0 && arryWithNums[i] != 0) {
                arr[i] = arryWithNums[i];
            }
        }
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                counter++;
            }
        }
        int[] trimmed = new int[counter];
        counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                trimmed[counter++] = arr[i];
            }

        }
        return trimmed;
    }

    public static int[] mathArray(int[] arr) {
        int[] mathArr = new int[4];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        mathArr[0] = sum;
        mathArr[1] = min;
        mathArr[2] = max;
        mathArr[3] = (int) sum / arr.length;


        return mathArr;
    }


}
