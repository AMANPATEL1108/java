public class Firstoccurence {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println(firstoccurence(arr, 5, 0));

    }

    public static int firstoccurence(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstoccurence(arr, key, i + 1);
    }

}
