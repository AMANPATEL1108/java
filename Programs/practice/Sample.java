import java.util.Scanner;

public class Sample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the first element to swap:");
        int a = sc.nextInt();

        System.out.println("Enter the second element to swap:");
        int b = sc.nextInt();

        int indexA = -1;
        int indexB = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                indexA = i;
            }
            if (arr[i] == b) {
                indexB = i;
            }
        }

        if (indexA != -1 && indexB != -1) {
            int temp = arr[indexA];
            arr[indexA] = arr[indexB];
            arr[indexB] = temp;
        } else {
            System.out.println("One or both elements not found in the array.");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
