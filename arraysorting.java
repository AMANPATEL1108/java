import java.util.Arrays;

public class arraysorting {
    public static void main(String[] args) {
        int[] array = { 5, 2, 9, 1, 5, 6 };

        System.out.println("Original Array: " + Arrays.toString(array));

        bubbleSort(array);

        System.out.println("Sorted Array (Ascending): " + Arrays.toString(array));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;

            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {

                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }

            n--;
        } while (swapped);
    }
}
