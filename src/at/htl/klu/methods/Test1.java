public class Test1 {
  public static void main(String[] args) {
    HtlMath.getRandomDice();

    int min = HtlMath.getMin(5, HtlMath.getMin(7, 12));
    System.out.println(min);

    int max = HtlMath.getMax(66, HtlMath.getMax(7, 12));
    System.out.println(max);

    boolean isPy = HtlMath.isRectangle(3, 4, 6);
    System.out.println(isPy);

    int area = HtlMath.getArea(3, 4, 5);
    System.out.println(area);

    int rect = HtlMath.getArea(3, 4);
    System.out.println(rect);

    int quad = HtlMath.getArea(3);
    System.out.println(quad);

    double theDig = HtlMath.round(13.5566);
    System.out.println(theDig);

    double newDig = HtlMath.round(3.1415, 1);
    System.out.println(newDig);

    int sum = HtlMath.getSum(3, 4, 13);
    System.out.println(sum);

    double summe = HtlMath.getSum(3.3, 3.3, 3.3);
    System.out.println(HtlMath.round(summe, 2));
  }
}
