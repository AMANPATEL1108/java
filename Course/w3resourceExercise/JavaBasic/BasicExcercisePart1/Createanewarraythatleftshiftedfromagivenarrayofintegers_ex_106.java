
import java.util.Arrays;

public class Createanewarraythatleftshiftedfromagivenarrayofintegers_ex_106 {
    public static void main(String[] args) {

        int[] arr = { 11, 15, 13, 10, 45, 20 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        if (arr.length > 1) {
            int first = arr[0];

            for (int i = 1; i < arr.length; i++)
                arr[i - 1] = arr[i];
            arr[arr.length - 1] = first;
            System.out.println("New Array: " + Arrays.toString(arr));
        }
    }

}
