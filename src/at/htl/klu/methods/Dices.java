import java.util.Arrays;
import java.util.Random;

public class Dices {
  public static void main(String[] args) {
    int[] arr = randomDice(100);
    int[] newArr = randomDice(100);
    int[] satiArr = staticAnalyse(arr);
    int[] statiNewArr = staticAnalyse(newArr);
    int[] sumArr = sumArr(satiArr, statiNewArr);
    int min = getMinCountValue(sumArr);
    System.out.println("Die Zahl kommt " + min + " am wenigsten vor");
    int max = getMaxCountValue(sumArr);
    System.out.println("Die Zahl kommt " + max + " am meisten vor");

    System.out.println(Arrays.toString(satiArr));
    System.out.println(Arrays.toString(statiNewArr));
    System.out.println(Arrays.toString(sumArr));
  }
  public static int[] randomDice(int value) {
    int[] arr = new int[value];
    Random rnd = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rnd.nextInt(1, 7);
    }
    return arr;
  }
  public static int[] staticAnalyse(int[] arr) {
    int[] staticArr = new int[6];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) {
        staticArr[0]++;
      } else if (arr[i] == 2) {
        staticArr[1]++;
      } else if (arr[i] == 3) {
        staticArr[2]++;
      } else if (arr[i] == 4) {
        staticArr[3]++;
      } else if (arr[i] == 5) {
        staticArr[4]++;
      } else {
        staticArr[5]++;
      }
    }
    return staticArr;
  }

  public static int getMaxCountValue(int[] arr) {
    int index = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        index = i;
        max = arr[i];
      }
    }
    return index + 1;
  }

  public static int getMinCountValue(int[] arr) {
    int index = 0;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        index = i;
        min = arr[i];
      }
    }
    return index + 1;
  }

  public static int[] sumArr(int[] arr, int[] arrtoo) {
    int[] newArr = new int[arr.length];
    for (int i = 0; i < newArr.length; i++) {
      newArr[i] = arr[i] + arrtoo[i];
    }
    return newArr;
  }
}
