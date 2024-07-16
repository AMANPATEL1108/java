
import java.util.Arrays;

public class Mergetwogivensortedarrayofintegersandcreateanewarray_ex_113 {
    public static void main(String arge[]) {
        int arr1[] = new int[8];

        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;

        int[] arr2 = { 2, 5, 7, 8 };

        System.out.println("Array1" + Arrays.toString(arr1));
        System.out.println("Arrays2" + Arrays.toString(arr2));

        int m = 4, n = 4;

        int i = m - 1, j = n - 1, index = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[index--] = arr1[i--];
            } else {
                arr1[index--] = arr2[j--];
            }
        }

        while (i >= 0) {
            arr1[index--] = arr1[i--];
        }

        while (j >= 0) {
            arr1[index--] = arr2[j--];
        }
        System.out.println("Merged Array:" + Arrays.toString(arr1));

    }
}
