import java.util.Arrays;

public class VorTestGLFS {
  public static void main(String[] args) {
    System.out.println("GLFS Arrays und Methoden");
    System.out.println("--------------------------------------");
    int[] arr = {1, 2, 3, 4};
    int[] arrToo = {1, 2, 3, 4};
    String o = isEquals(arr, arrToo);
    System.out.println(o);
    System.out.println("--------------------------------------");
    int[] filerArr = filterRange(2, 4, arr);
    System.out.println(Arrays.toString(filerArr));
    System.out.println("--------------------------------------");
    System.out.println(isSorted(arr));
    System.out.println("--------------------------------------");
    System.out.println(sentenceCount("Hallo. Das. ist ein Satz! "));
    System.out.println("--------------------------------------");
    System.out.println(countWords("Hallo hier wird jedes wort gezählt."));
  }

  public static String isEquals(int[] arr, int[] arrToo) {
    if (Arrays.equals(arr, arrToo)) {
      return "Das Arrray ist gleich";
    } else {
      return "Das Array ist nicht gleich";
    }
  }
  public static int[] filterRange(int low, int high, int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= low && arr[i] <= high) {
        count++;
      }
    }
    int idx = 0;
    int[] filterArr = new int[count];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= low && arr[i] <= high) {
        filterArr[idx++] = arr[i];
      }
    }
    return filterArr;
  }

  public static boolean isSorted(int[] arr) {
    boolean sorted = true;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        sorted = false;
        break;
      } else {
        sorted = true;
      }
    }
    return sorted;
  }

  public static int sentenceCount(String str) {
    int senCount = 1;
    for (int i = 0; i < str.length() - 1; i++) {

      if ((str.charAt(i) == '.' || str.charAt(i) == '!' ||
           str.charAt(i) == '?') &&
          str.charAt(i + 1) == ' ') {
        senCount++;
      }
    }
    return senCount;
  }

  public static int countWords(String str) {
    int wordCount = 0;
    for (int j = 0; j < str.length(); j++) {
      if (str.charAt(j) == ' ' || str.charAt(j) == '?' ||
          str.charAt(j) == '!' || str.charAt(j) == '.') {
        wordCount++;
      }
    }
    return wordCount;
  }
}
