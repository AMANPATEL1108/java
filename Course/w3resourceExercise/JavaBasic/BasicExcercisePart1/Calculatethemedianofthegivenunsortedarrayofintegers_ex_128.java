import java.util.Arrays;

public class Calculatethemedianofthegivenunsortedarrayofintegers_ex_128 {
    public static void main(String[] args) {
        int[] nums = { 10, 2, 38, 22, 38, 23 };

        System.out.println("Original" + Arrays.toString(nums));
        System.out.println("Median arrays of integer:" + getMedian(nums));

        int[] num1 = { 10, 2, 38, 23, 38, 23, 21 };
        System.out.println("Original" + Arrays.toString(num1));

        System.out.println("Median arrays of integer:" + getMedian(num1));
    }

    public static int getMedian(int[] array) {
        if (array.length % 2 == 0) {
            int mid = array.length / 2;
            return (array[mid] + array[mid - 1]) / 2;
        }
        return array[array.length / 2];
    }
}
