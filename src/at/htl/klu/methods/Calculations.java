import java.util.Random;

public class Calculations {

  public static int getAbsValue() {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    Random rnd = new Random();
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rnd.nextInt(1, 101);
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }

    int diff = max - min;
    return HtlMath.getAbs(diff);
  }
}
