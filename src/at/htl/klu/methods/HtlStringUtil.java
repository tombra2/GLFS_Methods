package at.htl.klu.methods;

public class HtlStringUtil {
    public static void main(String[] args) {

    }
    public static String  concat(String a, String b) {
        return MathMethods.concat(a, b, ';');
    }


    public static String concat(String a, String b, char sep) {
        return a + sep + b;
    }


}
