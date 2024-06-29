
import java.util.Arrays;

public class Getlargerelementoffirstandlastelementsofarray_ex_80 {
    public static void main(String[] args) {
        int arr[] = { 20, 30, 40 };

        System.out.println("Original array:" + Arrays.toString(arr));

        int max_arr = arr[0];

        if (arr[2] >= max_arr) {
            max_arr = arr[2];
            System.out.println("Larger valure Between first and last elemen:" + max_arr);
        }

    }
}
