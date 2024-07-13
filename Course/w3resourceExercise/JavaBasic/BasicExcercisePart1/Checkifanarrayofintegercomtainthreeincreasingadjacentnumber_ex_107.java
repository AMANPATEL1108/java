import java.util.Arrays;

public class Checkifanarrayofintegercomtainthreeincreasingadjacentnumber_ex_107 {

    public static void main(String[] args) {

        int arr[] = { 11, 12, 13, 14, 45, 20 };

        System.out.println("Orginal Array:" + Arrays.toString(arr));

        int result = 1;

        for (int i = 0; i <= arr.length - 3; i++) {
            if (arr[i] + 1 == arr[i + 1] && arr[i + 1] + 1 == arr[i + 2]) {
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