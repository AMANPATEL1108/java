import java.util.Arrays;

public class Roatetarraylengthintergerofleftdirection_ex_79 {
    public static void main(String[] args) {
        int arr[] = { 20, 30, 40 };

        System.out.println("Original array is :" + Arrays.toString(arr));

        int[] new_array = { arr[1], arr[2], arr[0] };

        System.out.println("Roteted array is :" + Arrays.toString(new_array));
    }

}