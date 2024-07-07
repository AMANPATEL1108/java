
import java.util.Arrays;

public class Createaarrayofstringvalue_ex_95 {
    public static void main(String[] args) {
        int n = 5;
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i);
        }
        System.out.println("New Array" + Arrays.toString(arr));
    }
}
