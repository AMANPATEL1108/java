import java.util.Arrays;

public class Checkifnumberof10or30sinagivenarrayofinteger_ex_102 {
    public static void main(String[] args) {
        int arr[] = { 11, 11, 13, 31, 45, 20, 33, 53 };
        int result = 1;
        System.out.println("Original array:" + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10 || arr[i] == 30) {
                result = 0;
            }
        }

        if (result == 1) {
            System.out.println(String.valueOf(false));
        } else {
            System.out.println(String.valueOf(true));
        }

    }
}
