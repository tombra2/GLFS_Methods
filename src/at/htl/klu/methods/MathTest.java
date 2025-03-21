package at.htl.klu.methods;


public class MathTest {
    public static void main(String[] args) {
        //Initial Variables
        int numa = 7;
        int numb = 3;
        // Get a Random int between 2 Variables
        int result = Math.getRandomInt(1, 10);
        System.out.println(result);

        //Get the absolute Value of a number given
        result = Math.getAbs(4);
        System.out.println(result);

        // Get the maximum Value of 2 Integers returned
        result = Math.getMax(numa, numb);
        System.out.println(result);

        // Get the minimum Value from 2 Integers returned
        result = Math.getMin(numa, numb);
        System.out.println(result);

        //Get a random Double Value between 2 Values back.
        double resultDouble = Math.getRandomDouble(numb, numa);
        System.out.println(resultDouble);

        // Get back a boolean value if Division has Zero rest.
        boolean resultBoolean = Math.isADividedByB(numa, numb);
        System.out.println(resultBoolean);

        // Get back a boolean value if the number given is even (true) and odd(false)
        resultBoolean = Math.isEven(numa);
        System.out.println(resultBoolean);


    }
}
