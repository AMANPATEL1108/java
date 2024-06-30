
import java.util.Arrays;

public class Firstmiddlelastlargestelementinevenlengthintegerarray_ex_82 {
    public static void main(String[] args) {
        int arr[] = { 20, 30, 40, 50, 67 };

        System.out.println("Original array " + Arrays.toString(arr));

        int max = arr[0];
        if (max <= arr[arr.length - 1])
            max = arr[arr.length - 1];

        if (max <= arr[arr.length / 2])
            max = arr[arr.length / 2];

        System.out.println("Largest is :" + max);
    }
}
