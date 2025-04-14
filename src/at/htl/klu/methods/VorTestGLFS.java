import java.util.Arrays;
import java.util.Collections;

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

    String str = runLengthEncoder("FFFFGGHHHHH");
    System.out.println(str);
    String dec = runLenghtDecoder(str);
    System.out.println(dec);
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
  public static String runLengthEncoder(String str) { // FFFF
    StringBuilder result = new StringBuilder();       //" "
    int count = 1;                                    // 1

    char[] arr = str.toCharArray(); // [F,F,F,F]
    for (int i = 0; i < arr.length; i++) {
      char c = arr[i]; // c =F  idx =0
      if (i + 1 < arr.length &&
          c == arr[i + 1]) { // 0+1 kleiner als arr.length (4) und c == arr[i+1]
        count++; // Wenn c das gleich ist wie der nächste value im nächsten idx
                 // dann ++
      } else {
        result.append(count).append(
            c);    // Wenn c also nicht gleich arr[i] ist dannheißt das das die
                   // folge fertig ist, wird dann hinzugefügt
        count = 1; // count wieder auf eins gestzt
      }
    }

    return result.toString();
  }

  public static String runLenghtDecoder(String str) {
    StringBuilder result = new StringBuilder();
    char[] arr = str.toCharArray();
    int count = 0;
    for (char c : arr) {
      if (Character.isDigit(c)) {
        count = 10 * count + Character.getNumericValue(c);
      } else {
        result.append(
            String.join("", Collections.nCopies(count, String.valueOf(c))));
        count = 0;
      }
    }

    return result.toString();
  }
}
