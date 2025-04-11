import java.util.Arrays;
import java.util.Random;

public class CountFrequencyGrades3 {
  public static void main(String[] args) {

    int[] arr = getRandomGrades(20);
    System.out.println(Arrays.toString(arr));
    int[] grades = getFrequencOfGrades(arr);
    System.out.println(Arrays.toString(grades));
    int positvGrades = countPositvGrades(grades);
    System.out.println(positvGrades);
  }

  public static int[] getRandomGrades(int len) {
    Random rnd = new Random();
    int[] arr = new int[len];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rnd.nextInt(1, 6);
    }
    return arr;
  }
  public static int[] getFrequencOfGrades(int[] arr) {
    int[] grades = new int[5];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) {
        grades[0]++;
      } else if (arr[i] == 2) {
        grades[1]++;
      } else if (arr[i] == 3) {
        grades[2]++;

      } else if (arr[i] == 4) {
        grades[3]++;
      } else {
        grades[4]++;
      }
    }
    return grades;
  }
  public static int countPositvGrades(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      sum += arr[i];
    }
    return sum;
  }
}
