import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        int[] array = { 10, 25, 5, 45, 30, 15 };
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();
        int index = linearSearch(array, target);

        if (index != -1) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }

        scanner.close();
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
