public class PrintStars {
  public static void main(String[] args) { printNStarts(10); }

  public static void printFiveStars() { System.out.println("*****"); }

  public static void printNStarts(int num) {
    for (int i = 0; i < num; i++) {
      System.out.print("*");
    }
  }
}
