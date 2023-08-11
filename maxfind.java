import java.util.Scanner;

/**
 * maxfind
 */
public class maxfind {

    public static void main(String[] args) {

        int arr[] = { 1000, 5000, 30, 3000, 25  };

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("the largest Number is:" + max);
    }
}