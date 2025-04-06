import java.util.Scanner;

public class TextAnalyse {
  public static int countChars() {

    Scanner sc = new Scanner(System.in);
    System.out.println("Gib eine beliebigen Text ein.");
    String text = sc.next();
    System.out.println("Gib den Buchstaben ein der gezählt werden soll.");
    char chr = sc.next().charAt(0);
    sc.close();
    return HtlStringUtil.getOccurrences(text, chr);
  }
}
