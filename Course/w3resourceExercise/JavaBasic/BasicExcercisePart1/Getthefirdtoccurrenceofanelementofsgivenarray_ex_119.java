public class Getthefirdtoccurrenceofanelementofsgivenarray_ex_119 {
    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 7, 8, 9 };
        int target = 7;

        int lower = 0;
        int upper = num.length - 1;

        int index = -1;

        while (lower <= upper) {
            int mid = (lower + upper) >> 1;

            if (num[mid] == target) {
                index = mid;
            }
            if (num[mid] >= target) {
                upper = mid - 1;
            } else {
                lower = mid + 1;
            }
        }
        System.out.println("Position of" + target + "is" + index);
    }
}
