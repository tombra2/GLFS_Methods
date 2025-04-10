import java.util.Arrays;
import java.util.Random;

public class CountFrequencyGrades1 {
  public static void main(String[] args) {
    Random rnd = new Random();
    int[] arr = new int[25];
    int[] grades = {0, 0, 0, 0, 0};

    for (int i = 0; i < arr.length; i++) {

      arr[i] = rnd.nextInt(1, 6);
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
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(grades));
    System.out.printf(
        "( grade / freq ) : (1/%d) , (2/%d) , (3/%d) , (4/%d) , (5/%d) ",
        grades[0], grades[1], grades[2], grades[3], grades[4]);
  }
}
