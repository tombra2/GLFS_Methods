import java.util.Random;

public class HtlMath {

  public static int getMin(int a, int b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }

  public static int getMax(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  public static int getSum(int a, int b) { return a + b; }

  public static int getAbs(int a) {

    if (a < 0) {
      return -a;

    } else {
      return a;
    }
  }
  public static double getQuotient(int numa, int numb) {
    double quote = (double)numa / numb;
    return quote;
  }

  public static boolean isEven(int a) {
    if (a % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static int getRandomInt(int min, int max) {
    Random rnd = new Random();
    return rnd.nextInt(min, max);
  }
  public static double getRandomDouble(int min, int max) {
    Random rnd = new Random();
    return rnd.nextDouble(min, max);
  }

  public static boolean isADividedByB(int a, int b) {
    if (a % b == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean isPrime(int num) {
    boolean isPrime = true;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }
    return isPrime;
  }

  public static void getRandomDice() {
    Random rnd = new Random();
    int dice = rnd.nextInt(1, 7);
    System.out.println("RandomDice " + dice);
  }

  public static boolean isRectangle(int a, int b, int c) {
    if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
      return true;
    }
    return false;
  }

  public static int getArea(int a, int b, int c) {
    if (isRectangle(a, b, c) == true) {
      return a * b / 2;
    } else {

      return -1;
    }
  }

  public static int getArea(int a, int b) { return a * b; }

  public static int getArea(int a) { return a * a; }

  public static double round(double num) {
    double scale = Math.pow(10, 2);
    return Math.round(num * scale) / scale;
  }

  public static double round(double toRound, int toDig) {
    double scale = Math.pow(10, toDig);
    return Math.round(toRound * scale) / scale;
  }

  public static int getSum(int... num) {
    int sum = 0;
    for (int i = 0; i < num.length; i++) {
      sum += num[i];
    }
    return sum;
  }

  public static double getSum(double... num) {
    double sum = 0;
    for (int i = 0; i < num.length; i++) {
      sum += num[i];
    }
    return sum;
  }
}
