public class Mergesort {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        Merge(arr, 0, arr.length - 1);
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Merge(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        Merge(arr, si, mid);
        Merge(arr, mid + 1, ei);
        mergefun(arr, si, mid, ei);
    }

    public static void mergefun(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left half, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right half, if any
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted subarray into the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}
