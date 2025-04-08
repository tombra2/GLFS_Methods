import java.util.Arrays;
public class MyAnalyses {
  public static void main(String[] args) {

    int[] grades = {3, 2, 4, 5, 4};
    int postiveGrades = countPassedExams(grades);
    double percPosGrade = (double)postiveGrades / grades.length * 100;
    System.out.println(percPosGrade);
    System.out.println(postiveGrades);
    double countAverageExams = countAverageExams(grades);
    System.out.println(countAverageExams);
    int[] arr = MyDiceUtilities.getSumOfPips(4, 20);
    System.out.println(Arrays.toString(arr));
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    System.out.println(max);
    int[] maxValueArr = new int[max];
    Arrays.fill(maxValueArr, 0); // 0
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= 0) {           // 4 idx 0
        maxValueArr[arr[i] - 1]++; // idx 3 maxValueArr 1
      }
    }

    int maxFrequenc = HtlArrayUtils.getMax(maxValueArr);
    int idx = HtlArrayUtils.getMaxIdx(maxValueArr);

    double relaiveFrequenc = (double)maxFrequenc / maxValueArr.length * 100;
  }

  public static int countPassedExams(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0 && arr[i] < 5) {
        count++;
      }
    }

    return count;
  }

  public static double countAverageExams(int[] arr) {
    int sum = 0;
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    double avg = sum / arr.length;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < avg && arr[i] != 0) {
        count++;
      }
    }
    double betterAverage = (double)count / arr.length * 100;

    return betterAverage;
  }
}
