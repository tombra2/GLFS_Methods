import java.util.Arrays;

public class TestArray {
  public static void main(String[] args) {
    int[] arr = HtlArrayUtils.getRandomArray(6, 0, 5);
    System.out.println(Arrays.toString(arr));

    System.out.println(HtlArrayUtils.getMin(arr));
    System.out.println(HtlArrayUtils.getMax(arr));
    System.out.println(HtlArrayUtils.getSum(arr));
    System.out.println(Arrays.toString(HtlArrayUtils.getAbsolute(arr)));
    System.out.println(HtlArrayUtils.getAverage(arr));
    // System.out.println(Arrays.toString(HtlArrayUtils.filterEven(arr)));
    System.out.println(Arrays.toString(HtlArrayUtils.reverseArray(arr)));
    System.out.println(HtlArrayUtils.countInArray(arr, 4));
    System.out.println(HtlArrayUtils.countMaxInArray(arr));
    System.out.println(HtlArrayUtils.countMinInArray(arr));
    System.out.println(Arrays.toString(HtlArrayUtils.removeNumber(arr, 2)));
  }
}
