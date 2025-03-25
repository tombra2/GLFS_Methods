package at.htl.klu.methods;

import java.lang.Math;
import java.util.Random;

public class MathMethods {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getRandomDiceValue() {
        Random random = new Random();
        return random.nextInt(1, 7);

    }

    public static int getMin(int a, int b) {
        return Math.min(a, b);
    }

    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    public static boolean Rectangle(int a, int b, int c) {
        return c * c == a * a + b * b;
    }

    public static double getArea_(int a, int b, int c) {
        if (c * c == a * a + b * b) {
            return (double) (a * b) / 2;
        } else {
            return -1;
        }
    }

    public static int getAreaQuad(int a) {
        return a * a;
    }

    public static double round(double a, int places) {
        return Math.round(a * Math.pow(10, places)) / Math.pow(10, places);

    }

    public static double round(double a) {
        return MathMethods.round(a, 2);
    }
}