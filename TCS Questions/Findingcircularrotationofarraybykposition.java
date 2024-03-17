/**
 * Findingcircularrotationofarraybykposition
 */
public class Findingcircularrotationofarraybykposition {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int k = 2;

        System.out.println("Original Array:");
        printArray(array);

        rotateArray(array, k);

        System.out.println("Array after rotating" + k + "position to the right:");

        printArray(array);
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, k - 1);

    }

    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
}