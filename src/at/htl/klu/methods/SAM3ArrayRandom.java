import java.util.Random;

public class SAM3ArrayRandom {
  public static void main(String[] args) {
    int[] arr = new int[20];
    Random rnd = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rnd.nextInt(1, 101);
    }
    int coun = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        coun++;
      }
    }
    int[] primeArr = new int[coun];
    coun = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        primeArr[coun] = arr[i];
      }
    }
    int max = HtlArrayUtils.getMax(primeArr);
    int min = HtlArrayUtils.getMin(primeArr);
    int length = primeArr.length;
    int sum = HtlArrayUtils.getSum(primeArr);
    double avg = HtlArrayUtils.getAverage(primeArr);

    System.out.printf("Summa %d , Anzahl %d, Minimum %d, Maximum %d und "
                          + "Mittelwert %.2f",
                      sum, length, min, max, avg);
  }
}
