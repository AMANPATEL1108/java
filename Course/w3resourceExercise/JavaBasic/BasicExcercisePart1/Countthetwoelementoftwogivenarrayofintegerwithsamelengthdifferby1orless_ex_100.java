import java.util.Arrays;

public class Countthetwoelementoftwogivenarrayofintegerwithsamelengthdifferby1orless_ex_100 {
    public static void main(String[] args) {
        int arr1[] = { 10, 11, 10, 20, 43, 20, 50 };
        int arr2[] = { 10, 13, 11, 20, 44, 30, 50 };

        System.out.println("Array1=" + Arrays.toString(arr1));
        System.out.println("Array2=" + Arrays.toString(arr2));

        int ctr = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (Math.abs(arr1[i] - arr2[i]) <= 1 && arr1[i] != arr2[i]) {
                ctr++;

            }
        }

        System.out.println("Number of Elements:" + ctr);
        System.out.println();

    }
}
