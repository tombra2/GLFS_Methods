import java.util.Arrays;
import java.util.Random;

public class CountFrequencyGrades2 {
  public static void main(String[] args) {
    Random rnd = new Random();
    int[] arr = new int[25];
    int[] grades = {0, 0};

    for (int i = 0; i < arr.length; i++) {
      arr[i] = rnd.nextInt(0, 6);
      if (arr[i] == 1) {
        grades[0]++;
      }

      else if (arr[i] == 5) {
        grades[1]++;
      }
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(grades));
    System.out.printf("( grade / freq ) : (1/%d) , (5/%d)", grades[0],
                      grades[1]);
  }
}
