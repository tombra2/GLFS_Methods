import java.time.LocalDateTime;

public class Greetings {
  public static void main(String[] args) {
    String time = saySystemTime();
    System.out.println(time);
  }

  public static String sayHello(int num) {
    if (num > 0 && num < 5) {

      return "Es ist Nacht";

    } else if (num > 6 && num < 10) {
      return "Guten Morgen";

    } else if (num > 11 && num < 14) {
      return "Mahlzeit";

    } else if (num > 15 && num < 19) {
      return "Guten Tag";

    } else if (num > 20 && num < 23) {
      return "Gute Nacht";

    } else if (num > 0 && num < 23) {
      return "Falsche Eingabe";

    } else {
      return "Falsche Eingabe";
    }
  }

  public static String saySystemTime() {
    LocalDateTime time = LocalDateTime.now();
    int hour = time.getHour();
    return sayHello(hour);
  }
}
