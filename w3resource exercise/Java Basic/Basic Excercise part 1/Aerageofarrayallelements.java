/**
 * Aerageofarrayallelements
 */
public class Aerageofarrayallelements {

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (double) arr[i];
        }
        double average = sum / n;
        System.out.println("the average is :" + average);
    }
}