public class Mutiplythecorrespondingelementsoftwointegerarrays_ex_83 {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, -5, 4 };

        int arr2[] = { 1, 4, -5, -2 };

        for (int i = 0; i < arr1.length; i++) {
            int arr3 = arr1[i] * arr2[i];
            System.out.print(arr3 + " ");

        }
    }
}
