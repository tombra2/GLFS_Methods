import java.util.Arrays;

public class MyAnalyses {
  public static void main(String[] args) {

    int[] arr = MyDiceUtilities.getSumOfPips(2, 20);
    System.out.println(Arrays.toString(arr));
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println(max);
    int[] maxValueArr = new int[max];
    Arrays.fill(maxValueArr, 0); // 0
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= 0) {           // 4 idx 0
        maxValueArr[arr[i] - 1]++; // idx 3 maxValueArr 1
      }
    }
    System.out.println(Arrays.toString(maxValueArr));

    int maxFrequenc = HtlArrayUtils.getMax(maxValueArr);
    int maxNum = 0;
    int idx = 0;
    for (int i = 0; i < maxValueArr.length; i++) {
      if (maxValueArr[i] > maxNum) {
        idx = i + 1;
      }
    }
    double relaiveFrequenc = (double)maxFrequenc / maxValueArr.length * 100;
    System.out.println("Häufisgte Zahl " + idx);
    System.out.println("Frequenz der h. Zahl " + maxFrequenc);
    System.out.println("relaiveFrequenc " + relaiveFrequenc);
  }
}
