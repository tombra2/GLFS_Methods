public class Test2 {

  public static void main(String[] args) {

    String str = HtlStringUtil.concatenateStrings("Hallo", "Thomas", ';');
    System.out.println(str);

    String strig = HtlStringUtil.concatenateStrings("Hallo", "Christph");
    System.out.println(strig);

    String aSequenz =
        HtlStringUtil.concatenateStrings("Hallo", "mein", "name", "ist");
    System.out.println(aSequenz);

    String bstring =
        HtlStringUtil.concatenateStringsMany("-", "Hallo", "Thomas");
    System.out.println(bstring);
  }
}
