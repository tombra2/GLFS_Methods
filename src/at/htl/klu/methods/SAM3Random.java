import java.util.Random;

public class SAM3Random {

  public static double[] Sam3Arr() {
    Random rnd = new Random();
    int sum = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    double avg = 0;
    int start = rnd.nextInt(1, 51);
    int[] arr = new int[100 - start];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + start;
    }
    int cout = 0;
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] % 2 == 0) {
        cout++;
      }
    }
    int[] onlyEven = new int[cout];
    cout = 0;
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] % 2 == 0) {
        onlyEven[cout++] = arr[j];
        sum += arr[j];
      }
    }
    for (int i = 0; i < onlyEven.length; i++) {
      if (onlyEven[i] < min) {
        min = onlyEven[i];
      }
    }
    for (int i = 0; i < onlyEven.length; i++) {
      if (onlyEven[i] > max) {
        max = onlyEven[i];
      }
    }

    avg = sum / onlyEven.length;
    double[] data = new double[5];
    data[0] = sum;
    data[1] = onlyEven.length;
    data[2] = min;
    data[3] = max;
    data[4] = avg;
    return data;
  }
}
