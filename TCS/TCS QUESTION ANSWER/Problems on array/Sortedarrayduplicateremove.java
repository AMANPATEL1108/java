import java.util.*;

public class Sortedarrayduplicateremove {
    public static void main(String[] args) {
        int[] array = { 1, 2, 5, 1, 7, 2, 4, 2, 6, 5 };

        System.out.println("Original Array: " + Arrays.toString(array));
        int[] result = removeDuplicates(array);
        System.out.println("Array with Duplicates Removed: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] array) {
        // Use a HashSet to store unique elements
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        // Convert the set back to an array
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }
}
