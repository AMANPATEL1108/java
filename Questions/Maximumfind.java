package Questions;

/**
 * Maximumfind
 */
public class Maximumfind {

    public static void main(String[] args) {
        int arr[] = { 12, 13, 14, 11 };
        System.out.println("The maximum number of the array is : " + findMax(arr));
    }

    public static int findMax(int arr[]) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {

                max = arr[i];
            }
        }
        return max;
    }
}