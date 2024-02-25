package Questions;

/**
 * Maximumfind
 */
public class Minimumfind {

    public static void main(String[] args) {
        int arr[] = { 12, 13, 14, 11, 16, 22, 2, 25 };
        System.out.println("The minimum number of the array is : " + min(arr));
    }

    public static int min(int arr[]) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {

                min = arr[i];
            }
        }
        return min;
    }
}