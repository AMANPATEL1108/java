public class TestIfAppearsAsEitherTheFirstOrLastElementOfAnArrayOfIntegers_ex_74 {
    public static void main(String[] args) {
        int[] num_arr = { 10, -20, 0, 30, 40, 60, 10 };

        boolean result = (num_arr[0] == 10 || num_arr[num_arr.length - 1] == 10);

        System.out.println(result);
    }
}
