public class Searchinrotatedsorted {

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 12 };
        int target = 0;
        int tarIdx = searchRotated(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);
    }

    public static int searchRotated(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }

        // Check if the left half is sorted
        if (arr[si] <= arr[mid]) {
            // If the target is in the left half
            if (arr[si] <= tar && tar <= arr[mid]) {
                return searchRotated(arr, tar, si, mid - 1);
            } else { // Otherwise, it's in the right half
                return searchRotated(arr, tar, mid + 1, ei);
            }
        } else { // Right half is sorted
            // If the target is in the right half
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return searchRotated(arr, tar, mid + 1, ei);
            } else { // Otherwise, it's in the left half
                return searchRotated(arr, tar, si, mid - 1);
            }
        }
    }
}
