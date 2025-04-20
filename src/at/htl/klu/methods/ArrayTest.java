package at.htl.klu.methods;

import java.util.Arrays;

public class ArrayTest {
  public static void main(String[] args) {
    int[] arr = {64, 34, 25, 12, 22, 11, 90, 5};
    boolean isSorted = Array.isSorted(arr);
    System.out.println(isSorted);
    int[] mirrorArray = Array.arryMirror(arr);
    System.out.println(Arrays.toString(mirrorArray));
    int[] swpArr = Array.swapSpace(arr);
    System.out.println(Arrays.toString(swpArr));
    int[] bubbleSortedArray = Array.bubbleSort(swpArr);
    System.out.println(Arrays.toString(bubbleSortedArray));
  }
}
