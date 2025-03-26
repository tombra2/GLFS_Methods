package at.htl.klu.methods;

public class HtlStringUtil {
    public static void main(String[] args) {

        String Note = concatenateStrings("Note", "4", '=');
        System.out.println(Note);
        System.out.println(concatenateStrings("Note","4"));
        System.out.println(WorterZuSatzen("Hallo", "Welt","!"));
        System.out.println(WorterZuSatzen(';',"Heute", "ist ", "ein", "schöner","Tag"));

    }
    public static String concatenateStrings(String a,String b, char c){

     return a + c + b;
    }

    public static String concatenateStrings(String a, String b){
        return concatenateStrings(a,b,';');
    }

    public static String WorterZuSatzen (String ... words){
        return String.join(" ", words);
        }

        public static String WorterZuSatzen(char a, String ... words){
        return String.join(String.valueOf(a),words);
        }
    }

