import java.util.Arrays;
import java.util.Random;

public class MyDiceUtilities {

  public static void main(String[] args) {
    int[] arr = getPips(6);
    System.out.println(Arrays.toString(arr));
  }
  public static int[] getPips(int val) {
    Random rnd = new Random();
    int[] arr = new int[val];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rnd.nextInt(1, 7);
    }
    return arr;
  }

  public static int[] getSumOfPips(int n, int length) {
    int[] sumArr = new int[length];
    for (int i = 0; i < n; i++) {
      int[] addArr = getPips(length);
      for (int j = 0; j < addArr.length; j++) {
        sumArr[j] += addArr[j];
      }
    }
    return sumArr;
  }
}
