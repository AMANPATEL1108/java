package Questions;

import java.util.Arrays;

import java.lang.reflect.Array;

/**
 * Secondmaxminfind
 */
public class Secondmaxminfind {

    public static void main(String[] args) {
        int[] a = { 12, 15, 17, 29, 2, 3, 4, 5, 6, 30, 29, 22, 20, 23, 25 };

        Arrays.sort(a);

        // System.out.println("sorted array is :");
        // for (int i = 0; i <= a.length; i++) {
        // System.out.println(a[i]);
        // }

        int secondsmallest = a[1];

        int secondlargest = a[a.length - 2];

        System.out.println("second smallest is :" + secondsmallest);
        System.out.println("secondLargest:" + secondlargest);
    }
}