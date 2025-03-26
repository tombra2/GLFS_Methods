package at.htl.klu.methods;

import java.lang.Math;
import java.util.Random;

public class HTLArrayUtils {
    public static int[] getRandomArray(int length, int min, int max) {
        int[] arr = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(min, max + 1);
        }
        return arr;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] getSum (int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i] + arr2[i];
        }
        return arr;
    }

    public static int[] reversArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];
        }
        return arr2;
    }

    public static int countArray (int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }
    public static int countArrayMax (int[] arr) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] == max) {
                count++;
            }
        }


        }
        return max;
    }
public static int countArrayMin (int[] arr) {
    int min = 0;
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] == min) {
                count++;
            }
        }
    }
    return min;
}
    public static int[] removeNumber ( int[] arr, int num) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                count++;
            }
        }
        int[] arr2 = new int[arr.length - count];

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != num) {
                arr2[j] = arr[j];
            }
        }
        return arr2;
    }

    public static int [] getAbsoult(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Math.abs(arr[i]);
        }
        return arr2;
    }

    public static double getAverage(int[] arr) {
        int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum =+ arr[i];
    }
    double avg = (double) sum / arr.length;
        return avg;
    }

    public static int [] filterEven (int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        int[] arr2 = new int[count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr2[count++] = arr[i];
            }
        }
        return arr2;
    }
}


