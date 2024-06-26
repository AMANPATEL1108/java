public class Lastoccurence {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println(lastOccurence(arr, 5, 0));

    }

    public static int lastOccurence(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        int isFounf = lastOccurence(arr, key, i + 1);

        if (isFounf == -1 && arr[i] == key) {
            return i;
        }

     

        return isFounf;
    }
}
