package at.htl.klu.methods;

public class StringMethoden {
    public class Arrays {

        public static boolean isSorted(int[] args) {
            boolean isSorted = true;

            for (int i = 1; i < args.length; i++) {
                if (args[i - 1] < args[i]) {
                    isSorted = false;
                }
            }
            return isSorted;
        }


        // 1,2,3,4 -> 4,3,2,1
        public static int[] mirrow(int[] a) {
            int[] temporary = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                temporary[i] = a[i];
            }
            int swap = 0;
            for (int i = 0; i < a.length / 2; i++) {
                swap = a[i];
                a[i] = a[a.length - i - 1];
                a[a.length - i - 1] = swap;
            }
            return temporary;
        }

/*
    // 1,2,3,4 (1) -> 0,1,2,3
    public static int[] shiftRight(int[], int offset) {              // offset = die Zahl um die es verschoben wird
        return null;
    }
    // 1,2,3,4 (1) -> 4,1,2,3
    public static int[] shiftLeft(int[] a, int offset) {}
*/


        public static void sort(int[] a) {
            int swapscpace = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] > a[j]) {
                        swapscpace = a[i];
                        a[i] = a[j];
                        a[j] = swapscpace;
                    }
                }
            }
        }


        public static boolean equals(int[] a, int[] b) {
            boolean equal = true;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    equal = false;
                    break;
                }
            }
            return equal;
        }


        public static int[] create(int lenght) {
            return new int[lenght];
        }


        public static void fill(int[] a, int val) {
            for (int i = 0; i < a.length; i++) {
                a[i] = val;
            }
        }


        public static void fillFromTo(int[] a, int from, int to, int val) {
            for (int i = from; i < to; i++) {
                a[i] = val;
            }
        }


        public static String toString(int[] a) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < a.length; i++) {
                sb.append(a[i]);
                if (i != a.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }


        // Summe
        public static double sum(int[] a) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            return sum;
        }

        // Min
        public static int min(int[] a) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < a.length; i++) {
                if (a[i] < min) {
                    min = a[i];
                }
            }
            return min;
        }

        // Max
        public static int max(int[] a) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
            return max;
        }

        // Average
        public static double avg(int[] a) {
            double avg = 0.0;
            double sum = 0.0;
            int counter = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
                counter++;
            }
            avg = sum / counter;
            return avg;
        }

    }
}