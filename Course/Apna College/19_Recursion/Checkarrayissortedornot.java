public class Checkarrayissortedornot {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println(Check(arr, 0));

    }

    public static boolean Check(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return Check(arr, i + 1);

    }
}
