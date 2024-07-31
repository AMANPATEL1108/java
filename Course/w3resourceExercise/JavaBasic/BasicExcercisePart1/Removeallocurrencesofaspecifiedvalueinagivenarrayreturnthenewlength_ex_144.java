
import java.util.Arrays;

public class Removeallocurrencesofaspecifiedvalueinagivenarrayreturnthenewlength_ex_144 {

    /**
     * Remove all occurrences of a given element from an array and return the new
     * length.
     * 
     * @param nums:    A list of integers
     * @param element: An integer to be removed
     * @return: The new length after removing the element
     */
    public static int removeElement(int[] nums, int elem) {
        int length = nums.length;
        if (length == 0)
            return 0;

        int i = 0;

        for (int j = 0; j < length; j++) {
            if (nums[j] != elem) {
                nums[i] = nums[j];
                i++;
            }
        }

        if (i < length)
            nums[i] = '\0';
        return i;
    }

    public static void main(String[] args) {
        int x = 6;
        int[] nums = { 1, 4, 6, 7, 6, 2 };
        System.out.println("Original Array:" + Arrays.toString(nums));

        System.out.println("The length of the new array is :" + removeElement(nums, x));

    }
}
