public class glfs2 {

    public static void main(String[] args) {

    }

    public static int[] arr(int[] arr, int min, int max) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min && arr[i] < max) {
                count++;
            }
        }

        int[] newArr = new int[count];
        for (int i = 0; i < newArr.length; i++) {

        }

        return newArr;

    }

}
