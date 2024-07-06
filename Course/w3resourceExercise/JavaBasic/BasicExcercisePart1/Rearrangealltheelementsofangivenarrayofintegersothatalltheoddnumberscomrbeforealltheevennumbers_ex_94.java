import java.util.Arrays;

public class Rearrangealltheelementsofangivenarrayofintegersothatalltheoddnumberscomrbeforealltheevennumbers_ex_94 {
    public static void main(String[] args) {
        int nums[] = { 1, 7, 8, 5, 7, 13, 0, 2, 4, 9 };

        int i = 0;
        System.out.println("Original  array:" + Arrays.toString(nums));

        while (i < nums.length && nums[i] % 2 == 0)
            i++;

        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] % 2 != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }

        System.out.println("New Array is :" + Arrays.toString(nums));
    }
}
