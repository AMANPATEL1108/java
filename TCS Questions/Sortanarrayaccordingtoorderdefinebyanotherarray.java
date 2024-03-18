import java.util.Comparator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Sortanarrayaccordingtoorderdefinebyanotherarray {

    public static void main(String[] args) {
        int[] arr1 = { 2, 1, 7, 5, 3 };
        int[] arr2 = { 7, 2, 5 };

        int[] sortedArr = sortByArray(arr1, arr2);

        System.out.println("Original Array: " + Arrays.toString(arr1));
        System.out.println("Order Array: " + Arrays.toString(arr2));
        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
    }

    public static int[] sortByArray(int[] arr1, int[] arr2) {
        // Create a map to store the indices of elements in arr2
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            indexMap.put(arr2[i], i);
        }

        // Custom comparator to compare elements based on their index in arr2
        Comparator<Integer> customComparator = Comparator.comparingInt(
                // If element exists in arr2, compare by its index, otherwise by the element
                // itself
                val -> indexMap.getOrDefault(val, Integer.MAX_VALUE));

        // Sort arr1 using the custom comparator
        Integer[] boxedArr1 = Arrays.stream(arr1).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArr1, customComparator);

        // Convert Integer array back to primitive int array
        int[] sortedArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            sortedArr[i] = boxedArr1[i];
        }

        return sortedArr;
    }
}