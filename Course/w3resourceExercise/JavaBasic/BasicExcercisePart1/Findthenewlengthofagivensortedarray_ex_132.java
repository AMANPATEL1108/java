import java.util.Arrays;

public class Findthenewlengthofagivensortedarray_ex_132 {
    static int remove_Deuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int index = 1;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index] || (nums[i] == nums[index] && nums[i] != nums[index - 1])) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7 };
        System.out.println("Original array:" + Arrays.toString(nums));
        System.out.println("The length of the original array is :" + nums.length);
        System.out.println("After removing duplicates ,the new length of the array is :" + remove_Deuplicates(nums));
    }
}
