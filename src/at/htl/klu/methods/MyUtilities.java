public class MyUtilities {

  public static void main(String[] args) {
    boolean isPythagoreanTriple = isPythagoreanTriple(3, 4, 5);
    System.out.println(isPythagoreanTriple);
  }

  public static boolean isPythagoreanTriple(int a, int b, int c) {
    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {

      return true;
    } else {
      return false;
    }
  }
}
