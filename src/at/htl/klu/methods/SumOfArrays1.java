import java.util.Arrays;
import java.util.Random;

public class SumOfArrays1 {

  public static void main(String[] args) {
    int rnd = randomNum();
    System.out.println(rnd);

    int[] arr = randomArr(rnd);
    int[] arrToo = randomArr(rnd);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arrToo));

    int[] sumArray = sumArrays(arr, arrToo);
    System.out.println(Arrays.toString(sumArray));

    int min = getMin(sumArray);
    System.out.println(min);
    int max = getMaxValue(sumArray);
    System.out.println(max);
  }

  public static int randomNum() {
    Random rnd = new Random();
    return rnd.nextInt(5, 15);
  }

  public static int[] randomArr(int len) {
    int[] arr = new int[len];
    Random rnd = new Random();
    for (int i = 0; i < len; i++) {
      arr[i] = rnd.nextInt(10, 21);
    }
    return arr;
  }
  public static int[] sumArrays(int[] a, int[] b) {
    int[] arr = new int[a.length];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = a[i] + b[i];
    }
    return arr;
  }

  public static int getMaxValue(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public static int getMin(int[] arr) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }
}
