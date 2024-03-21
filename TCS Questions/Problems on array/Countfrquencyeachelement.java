package Questions;

public class Countfrquencyeachelement {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 3, 2, 2, 3, 5, 7, 10 };
        int n = arr.length;
        countFreq(arr, n);
    }

    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] == true) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;

                }
            }
            System.out.println(arr[i] + " " + count);

        }
    }
}
