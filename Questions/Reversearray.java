/**
 * ReverseArray
 */
public class Reversearray {

    public static void main(String[] args) {
        int[] a = { 12, 13, 14, 15 };

        System.out.println("Original array is:");
        printArray(a);

        int[] reversedArray = reverse(a);

        System.out.println("Reversed array is : ");
        printArray(reversedArray);
    }

    public static int[] reverse(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
