import java.util.Arrays;

public class Createtwoarrayandfirstarrayfirstelementandsecondarraylastelementprint_ex_77 {
    public static void main(String[] args) {
        int arr1[] = { 50, -20, 0 };
        int arr2[] = { 5, -50, 10 };

        System.out.println("Array1:" + Arrays.toString(arr1));

        System.out.println("Array1:" + Arrays.toString(arr2));

        int newArray[] = { arr1[0], arr2[2] };

        System.out.println("New Array is:" + Arrays.toString(newArray));

    }
}
