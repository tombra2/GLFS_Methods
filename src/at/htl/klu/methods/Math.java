package at.htl.klu.methods;

import java.util.Random;

public class Math {

    public static int getMin(int numa, int numb) {
        if (numa < numb) {
            return numa;
        } else {
            return numb;
        }
    }

    public static int getMax(int numa, int numb) {
        if (numa > numb) {
            return numa;
        } else {
            return numb;
        }
    }

    public static int getSum(int numa, int numb) {
        return numa + numb;
    }

            public static int getAbs(int numa) {
        if (numa < 0) {
            return -numa;
        } else {
            return numa;
        }
    }

    public static double getQuotient(int numa, int numb) {
        return (double) numa / numb;
    }

    public static boolean isEven(int numa) {
        return numa % 2 == 0;
    }

    public static int getRandomInt(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt(min, max);
    }

    public static double getRandomDouble(int min, int max) {
        Random rnd = new Random();
        return rnd.nextDouble(min, max);
    }

    public static boolean isADividedByB(int numa, int numb) {
        return numa % numb == 0;

    }
    public static boolean isPerfectNumber(int numa){
        return numa == numa - 1 + numa - 2;
    }


}
