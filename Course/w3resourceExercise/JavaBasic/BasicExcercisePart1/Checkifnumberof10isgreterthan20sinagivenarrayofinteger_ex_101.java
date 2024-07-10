import java.util.Arrays;

public class Checkifnumberof10isgreterthan20sinagivenarrayofinteger_ex_101 {
    public static void main(String[] args) {
        int arr[] = { 10, 11, 10, 30, 45, 33, 53 };
        int result = 0;
        System.out.println("Original array:" + Arrays.toString(arr));

        int ctr1 = 0;
        int ctr2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10)
                ctr1++;

            if (arr[i] == 20)

                ctr2++;

        }
        System.out.println(String.valueOf(ctr1 > ctr2));
        System.out.println();
    }
}
