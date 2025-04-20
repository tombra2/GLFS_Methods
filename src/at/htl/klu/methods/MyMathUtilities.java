package at.htl.klu.methods;

import java.util.Arrays;

public class MyMathUtilities {
 /* public static void main(String[] args) {
    int min = getMin(new int[] {1, 2, 3, 4, 5});
    int[] rnd = DiffOfArrays1.getRandomArr(10, 20, 30, 40);
    System.out.println(Arrays.toString(rnd));
    int count = getDiffCountElements(20, 40, rnd);
    System.out.println(count);
  }*/

  public static int getMin(int[] a) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < a.length; i++) {
      if (a[i] < min) {
        min = a[i];
      }
    }
    return min;
  }

  public static int getMaxIdx(int[] a) {
    int max = Integer.MIN_VALUE;
    int idx = -1;
    for (int i = 0; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
        idx = i;
      }
    }
    return idx;
  }
  public static int getDiffCountElements(int from, int to, int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > from && arr[i] < to) {
        count++;
      }
    }
    return count;
  }
}
