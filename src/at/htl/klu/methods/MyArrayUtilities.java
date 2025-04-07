import java.util.Arrays;

public class MyArrayUtilities {
  public static void main(String[] args) {
    int[] arrA = {1, 2, 3, 4, 5};
    int[] arrB = {1, 2, 3, 4, 5};

    int[] arrSum = getSum(arrA, arrB);
    System.out.println(Arrays.toString(arrSum));

    int[] arrDiff = getDif(arrA, arrB);
    System.out.println(Arrays.toString(arrDiff));

    int[] arrMul = getMul(arrA, arrB);
    System.out.println(Arrays.toString(arrMul));
  }

  public static int[] getSum(int[] arr, int[] arrToo) {
    for (int i = 0; i < arrToo.length; i++) {
      arr[i] += arrToo[i];
    }
    return arr;
  }
  public static int[] getDif(int[] arr, int[] arrToo) {
    for (int i = 0; i < arrToo.length; i++) {
      arr[i] -= arrToo[i];
    }
    return arr;
  }
  public static int[] getMul(int[] arr, int[] arrToo) {
    for (int i = 0; i < arrToo.length; i++) {
      arr[i] *= arrToo[i];
    }
    return arr;
  }
}
