import java.util.Arrays;
import java.util.Random;

public class Analysis {

  public static void main(String[] args) {

    int[] arr = new int[20];
    Random rnd = new Random();

    for (int i = 0; i < arr.length; i++) {
      arr[i] = rnd.nextInt(1, 11);
    }

    System.out.println(Arrays.toString(arr));
    System.out.println("Länge des Arrays");
    System.out.println(arr.length);
    System.out.println("Durschnitts Wert des Arrays");
    System.out.println(HtlArrayUtils.getAverage(arr));
    System.out.println("Maximum des Arrays und wie oft die Zahl vorkomt");
    System.out.println(HtlArrayUtils.getMax(arr));
    System.out.println(HtlArrayUtils.countMaxInArray(arr));
    System.out.println(HtlArrayUtils.getMin(arr));
    System.out.println(HtlArrayUtils.countMinInArray(arr));
    System.out.println(Arrays.toString(HtlArrayUtils.reverseArray(arr)));
  }
}
