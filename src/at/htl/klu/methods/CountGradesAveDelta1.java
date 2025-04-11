import java.util.Arrays;
import java.util.Random;

public class CountGradesAveDelta1 {
  public static void main(String[] args) {
    int[] grades = getGrades(10);
    System.out.println(Arrays.toString(grades));
    double avg = (double)sumOfArr(grades) / getCountPositvGrades(grades);
    System.out.println(avg);
    int interval = withInInterval(avg, grades);
    System.out.printf("%d Noten sind im Interval %.2f - %.2f", interval,
                      (avg - 1), (avg + 1));
  }

  public static int[] getGrades(int a) {
    Random rnd = new Random();
    int[] arr = new int[6];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rnd.nextInt(0, 6);
    }
    return arr;
  }
  public static int sumOfArr(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }
  public static int getCountPositvGrades(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        count++;
      }
    }
    return count;
  }
  public static int withInInterval(double avg, int[] arr) {
    int grades = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > (avg - 1) && arr[i] < (avg + 1)) {
        grades++;
      }
    }
    return grades;
  }
}
