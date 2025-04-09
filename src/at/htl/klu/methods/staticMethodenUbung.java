import java.util.Arrays;
import java.util.Random;

public class staticMethodenUbung {
  public static void main(String[] args) {
    System.out.println("Übungsaufgabe static Methoden 1");
    System.out.println("--------------------------------------------");
    System.out.println(printLine("x", 10));
    System.out.println(printLine("#", 20));
    System.out.println(calcMissingEdge(3, 0, 0));
    System.out.println(getRandomNumber(7, 5));
    System.out.println(getMax(13.5, 16, 17, 22.3));
    System.out.println(getMin(13.5, 16, 17, 22.3));
    System.out.println(Arrays.toString(createArray(5)));
    int[] arr = new int[20];
    arr = fillArray(arr, 10, 100);
    // System.out.println(Arrays.toString(fillArray(arr, 5, 10)));
    System.out.println(Arrays.toString(getEvenNumbers(arr)));
    int[] sumArr = {1, 2, 3, 4};
    System.out.println(calcSum(sumArr));
    System.out.println(calcAvg(sumArr));
    String str = "Thomas1234";
    System.out.println(countNumerics(str));
    System.out.println(solve("1 + 1"));
  }

  public static int calcSum(int a, int b, int c) { return a + b + c; }
  public static String printLine(String s, int count) {
    String str = "";
    for (int i = 0; i <= count; i++) {
      str += s;
    }
    return str;
  }

  public static int calcRectangleArea(int a, int b) { return a * b; }
  public static int calcRectangleCircumference(int a, int b) {
    int val = (a * 2) + (b * 2);
    return val;
  }

  public static double calcMissingEdge(double a, double b, double c) {
    double val = 0;
    if (c == 0 && a > 0 && b > 0) {
      val = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    } else if (b == 0 && a > 0 && c > 0) {
      val = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
    } else if (a == 0 && b > 0 && c > 0) {
      val = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
    } else {
      val = -1;
    }
    return val;
  }
  public static int getRandomNumber(int min, int max) {
    if (min < max) {
      Random rnd = new Random();
      return rnd.nextInt(min, max + 1);
    } else {
      return 0;
    }
  }
  public static double getMax(double... numbers) {
    double max = Integer.MIN_VALUE;
    for (double num : numbers) {
      if (num > max) {
        max = num;
      }
    }
    return max;
  }

  public static double getMin(double... numbers) {
    double min = Integer.MAX_VALUE;
    for (double num : numbers) {
      if (num < min) {
        min = num;
      }
    }
    return min;
  }
  public static int[] createArray(int val) {
    int[] arr = new int[val];

    for (int i = 0; i < val; i++) {
      arr[i] = 1;
    }
    return arr;
  }
  public static int[] fillArray(int[] array, int min, int max) {
    Random rnd = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = rnd.nextInt(min, max + 1);
    }
    return array;
  }

  public static int[] getEvenNumbers(int[] array) {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        count++;
      }
    }
    int[] arr = new int[count];
    int idx = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        arr[idx++] = array[i];
      }
    }
    return arr;
  }

  public static int calcSum(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum;
  }
  public static double calcAvg(int[] array) {
    int sum = calcSum(array);
    return (double)sum / array.length;
  }

  public static int countNumerics(String str) {

    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (Character.isDigit(str.charAt(i))) {
        count++;
      }
    }
    return count;
  }
  public static int solve(String calculation) {
    String[] value = calculation.split(" ");
    int sum = Integer.parseInt(value[0]);

    for (int i = 1; i < value.length; i += 2) {
      String operator = value[i];
      int number = Integer.parseInt(value[i + 1]);

      if (operator.equals("+")) {
        sum += number;

      } else if (operator.equals("-")) {
        sum -= number;
      }
    }

    return sum;
  }
  public static String generatePadding(String s, char padding, int count,
                                       boolean right) {
    String str = "";
    String add = "";
    if (right == true) {
      for (int i = 0; i < count; i++) {
        add += padding;
      }
      return str;
    }
  }
}
