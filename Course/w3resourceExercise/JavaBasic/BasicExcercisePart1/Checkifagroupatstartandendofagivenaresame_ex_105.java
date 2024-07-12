import java.util.Arrays;

public class Checkifagroupatstartandendofagivenaresame_ex_105 {
    public static void main(String[] args) {
        int arr[] = { 11, 15, 13, 10, 45, 20, 11, 15 };
        System.out.println("Original Array:" + Arrays.toString(arr));

        int result = 0;
        int l = 2;
        int start = 0;
        int end = arr.length - l;

        for (; l > 0; l--) {
            if (arr[start] != arr[end]) {
                result = 1;
            } else {
                start++;
                end++;
            }
        }

        if (result == 1) {
            System.out.println(String.valueOf(false));
        } else {
            System.out.println(String.valueOf(true));
        }
    }
}
