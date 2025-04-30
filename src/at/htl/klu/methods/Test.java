import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int min = HtlMath.getMin(5, 10);
        System.out.println("Ausgabe der niedriegsten Zahl");
        System.out.println(min);

        int max = HtlMath.getMax(5, 10);
        System.out.println("Ausgabe der höchsten Zahl.");
        System.out.println(max);

        int sum = HtlMath.getSum(5, 10);
        System.out.println("Ausgabe der Summe");
        System.out.println(sum);

        double getQuotient = HtlMath.getQuotient(100, 25);
        System.out.println("Ausgabe des Quotienten einer Division");
        System.out.println(getQuotient);

        boolean isEven = HtlMath.isEven(10);
        System.out.println("Augabe ob die Zahl Even oder Odd ist.");
        System.out.println(isEven);

        int rnd = HtlMath.getRandomInt(5, 10);
        System.out.println("Gibt eine Random Zahl zwischen zwei Ganzzahlen aus. ");
        System.out.println(rnd);

        double rndTwo = HtlMath.getRandomDouble(5, 10);
        System.out.println(
                "Gibt eine Random Gleitkommezahl zwischen zwei Ganzzahlen aus");
        System.out.printf("%.2f", rndTwo);
        System.out.println();

        boolean isDividedBy = HtlMath.isADividedByB(6, 2);
        System.out.println("Ausgabe ob a / b  keine Rest hat");
        System.out.println(isDividedBy);

        double[] arr = new double[5];
        arr = SAM3Random.Sam3Arr();
        System.out.println("Gibt Summe, Anzahl, Max, Min, Avg");
        System.out.println(Arrays.toString(arr));

        int rndAbs = Calculations.getAbsValue();
        System.out.println("Gibt einen Random Abs Value aus Random Zahlen zurück");
        System.out.println(rndAbs);

        boolean isPal = HtlStringUtil.isPalindrome("hannaH");
        System.out.println(isPal);

        boolean isQuest = HtlStringUtil.isQuestion("Hallo ");
        System.out.println(
                "Gibt zürck ob der übergebeben String als letztes ein Fragezeichen "
                        + "hat");
        System.out.println(isQuest);

        boolean isShout = HtlStringUtil.isRequest("Meine Hand ist ausgestreckt");
        System.out.println(isShout);

        boolean isState = HtlStringUtil.isStatement("Hallo.");
        System.out.println(isState);

        int a = HtlStringUtil.getOccurrences("Heute ist ein guter Tag.", 'e');
        System.out.println("De Buchstaben a kommt " + a + "mal vor");
    }
}
