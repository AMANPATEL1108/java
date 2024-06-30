import java.util.Arrays;

public class Swapfirstandlastarrayandcreateanewarray_ex_81 {

    public static void main(String[] args) {
        int[] arr = { 20, 30, 40 };
        System.out.println("Oroginal array is =" + Arrays.toString(arr));
        int x = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = x;

        System.out.println("New array After Swaping is " + Arrays.toString(arr));
    }
}