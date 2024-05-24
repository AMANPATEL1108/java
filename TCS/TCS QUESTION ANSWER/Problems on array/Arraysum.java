import java.util.stream.IntStream;

public class Arraysum {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 1, 2, 3, 4, 5 };
        int sum = IntStream.of(arr).sum();
        System.out.println("the sum of element of the array is " + sum);
    }

}
