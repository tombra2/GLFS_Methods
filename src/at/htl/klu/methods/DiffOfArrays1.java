import java.util.Arrays;
import java.util.Random;

public class DiffOfArrays1 {
  public static void main(String[] args) {
    int[] arr = getRandomArr(10, 20, 30, 40);
    System.out.println(Arrays.toString(arr));
    int min = getMin(arr);
    System.out.println(min);
    int max = getMax(arr);
    System.out.println(max);
    double avg = getAvg(arr);
    System.out.println(avg);
  }
  public static double getAvg(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return (double)sum / arr.length;
  }
  public static int getMax(int[] arr) {
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
  public static int[] getRandomArr(int a, int b, int c, int d) {
    Random rnd = new Random();
    int len = rnd.nextInt(a, b);
    int[] arr = new int[len];
    int[] arrtoo = new int[len];
    int[] diffArr = new int[len];

    for (int i = 0; i < len; i++) {
      arr[i] = rnd.nextInt(c, d);
      arrtoo[i] = rnd.nextInt(a, b);
      diffArr[i] = arr[i] - arrtoo[i];
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arrtoo));
    return diffArr;
  }
}
