package at.htl.klu.methods;

public class ArraysTest {
    public static void main(String[] args) {

        // Fill Methode
        int[] a = new int[16];
        Arrays.fill(a, 10);
        System.out.println(java.util.Arrays.toString(a));


        // Fill from-to
        int[] d = new int[8];
        System.out.println(Arrays.toString(d));
        Arrays.fillFromTo(d, 2,6,9);
        System.out.println(Arrays.toString(d));


        // String-Builder Methode
        System.out.println(Arrays.toString(a));


        // Alle 3 Methoden zusammen
        int[] b = create(16);
        Arrays.fill(b, 10);
        System.out.println(Arrays.toString(b));


        // Vergleich der beiden Arrays
        if(Arrays.equals(a, b)) {
            System.out.println("a equals b");
        } else {
            System.out.println("a not equals b");
        }


        // Bubble-Sort
        int[] c = {1, 7, 3, 9, 4, 15, 5, 8};
        System.out.println(Arrays.toString(c));
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));


        // Abfragen ob es sortiert ist
        int[] e = {1, 7, 3, 9, 4, 15, 5, 8};
        boolean x = Arrays.isSorted(e);
        System.out.println(x);
        Arrays.sort(e);
        System.out.println(x);


        // mirror spiegeln
        int[] f = {1, 7, 3, 9, 4, 15, 5, 8};
        System.out.println(Arrays.toString(f));
        Arrays.mirrow(f);
        System.out.println(Arrays.toString(f));

        // sum ausgeben
        int[] g = {1, 7, 3, 9, 4, 15, 5, 8};
        double sumVonG = Arrays.sum(g);
        System.out.println(sumVonG);

        // min ausgeben
        int minVonG = Arrays.min(g);
        System.out.println(minVonG);

        // max ausgeben
        int maxVonG = Arrays.max(g);
        System.out.println(maxVonG);

        // avg ausgeben
        double avgVonG = Arrays.avg(g);
        System.out.println(avgVonG);


    }
}
