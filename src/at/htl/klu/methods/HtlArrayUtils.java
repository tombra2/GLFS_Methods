import java.util.Random;
import javax.management.monitor.CounterMonitor;

public class HtlArrayUtils {

  public static int[] getRandomArray(int length, int min, int max) {
    int[] arr = new int[length];
    Random rnd = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rnd.nextInt(min, max + 1);
    }
    return arr;
  }

  public static int getMin(int[] foo) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < foo.length; i++) {
      if (foo[i] < min) {
        min = foo[i];
      }
    }
    return min;
  }

  public static int getMax(int[] bar) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < bar.length; i++) {
      if (bar[i] > max) {
        max = bar[i];
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

  public static int[] getAbsolute(int[] arr) {
    int[] arrAbs = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      arrAbs[i] = Math.abs(arr[i]);
    }
    return arrAbs;
  }

  public static double getAverage(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return (double)sum / arr.length;
  }
  public static int[] filterEven(int[] arr) {
    int counter = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        counter++;
      }
    }
    int[] arrFilter = new int[counter];
    counter = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] % 2 == 0) {
        arrFilter[counter++] = arr[i];
      }
    }
    return arrFilter;
  }
  public static int[] reverseArray(int[] arr) {
    int[] revArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      revArr[arr.length - i - 1] = arr[i];
    }
    return revArr;
  }
  public static int countInArray(int[] arr, int z) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == z) {
        count++;
      }
    }
    return count;
  }

  public static int countMaxInArray(int[] arr) {
    int max = Integer.MIN_VALUE;

    int counter = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] == max) {
        counter++;
      }
    }
    return counter;
  }

  public static int countMinInArray(int[] arr) {
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    int counter = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == min) {
        counter++;
      }
    }
    return counter;
  }

  public static int[] removeNumber(int[] arr, int z) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == z) {
        count++;
      }
    }

    int[] arrFilter = new int[arr.length - count];
    count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != z) {
        arrFilter[count++] = arr[i];
      }
    }
    return arrFilter;
  }
}
