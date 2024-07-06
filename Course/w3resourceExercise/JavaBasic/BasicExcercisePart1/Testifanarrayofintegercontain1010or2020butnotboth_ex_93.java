
import java.util.Arrays;

public class Testifanarrayofintegercontain1010or2020butnotboth_ex_93 {
    public static void main(String arges[]) {
        int nums[] = { 10, 10, 2, 4, 20, 20 };
        int even = 0, odd = 0;
        System.out.println("Original array:" + Arrays.toString(nums));

        boolean found10 = false;
        boolean found20 = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 10 && nums[i + 1] == 10) {
                found10 = true;
            }

            if (nums[i] == 20 && nums[i + 1] == 20) {
                found20 = true;
            }
        }

        System.out.println(String.valueOf(found10 != found20));
        System.out.println();
    }

}
