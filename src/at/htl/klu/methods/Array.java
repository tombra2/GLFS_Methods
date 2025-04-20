package at.htl.klu.methods;

public class Array {

  public static boolean isSorted(int[] arr) {
    boolean isSorted = true;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        isSorted = false;
        break;
      }
    }
    return isSorted;
  }

  public static int[] arryMirror(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      int swp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = swp;
    }
    return arr;
  }
  public static int[] swapSpace(int[] arr) {
    for (int i = 0; i < arr.length - 1; i += 2) {
      int swp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = swp;
    }
    return arr;
  }

  public static int[] bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int swp = arr[i];
          arr[i] = arr[j];
          arr[j] = swp;
        }
      }
    }

    return arr;
  }

}
