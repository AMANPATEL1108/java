public class Firstandlastelenmentaresameinarray_ex_76 {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 2, 5, 2, 1 };
        int arr2[] = { 5, 7, 9, 6, 5, 4, 1 };

        if (arr1.length >= 2 && arr2.length >= 2) {
            System.out.println(arr1[0] == arr2[0] || arr1[arr1.length - 1] == arr2[arr2.length - 1]);
        } else {
            System.out.println("Array length is less than 2");
        }

    }
}
