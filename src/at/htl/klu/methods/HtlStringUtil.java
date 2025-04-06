
public class HtlStringUtil {

  public static int getOccurrences(String str, char a) {

    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == a) {
        count++;
      }
    }
    return count;
  }

  public static boolean isPalindrome(String str) {
    boolean isPalindrome = true;
    String newStr = str.toLowerCase();
    System.out.println(newStr);
    for (int i = 0; i < newStr.length() / 2; i++) {
      if (newStr.charAt(i) != newStr.charAt(newStr.length() - i - 1)) {
        System.out.println(newStr.charAt(i));
        System.out.println(newStr.charAt(newStr.length() - 1 - i));
        isPalindrome = false;
      }
    }
    return isPalindrome;
  }

  public static boolean isQuestion(String str) {
    boolean xxx = false;
    if (str.charAt(str.length() - 1) == '?') {
      System.out.println("JA das ist eine Frage.");
      xxx = true;
    }
    return xxx;
  }

  public static boolean isRequest(String str) {
    boolean isRequest = false;
    if (str.charAt(str.length() - 1) == '!')
      isRequest = true;
    System.out.println("JA das ist ein Staz mit Rufzeichen");
    return isRequest;
  }

  public static boolean isStatement(String str) {
    boolean yyy = false;
    if (str.charAt(str.length() - 1) == '.') {
      yyy = true;
    }
    return yyy;
  }

  public static String concatenateStrings(String a, String b, char c) {
    String d = a + c + b;
    return d;
  }

  public static String concatenateStrings(String a, String b) {
    return concatenateStrings(a, b, ';');
  }

  public static String concatenateStrings(String... str) {
    return String.join(";", str);
  }

  public static String concatenateStringsMany(String sep, String... str) {
    return String.join(sep, str);
  }
}
