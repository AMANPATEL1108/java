/**
 * Firstandlastelementofarrayofintegeraresamelengthmustbebroaderthanoeequaltwo
 */
public class Firstandlastelementofarrayofintegeraresamelengthmustbebroaderthanoeequaltwo_ex_75 {

    public static void main(String[] args) {
        int[] num_arr = { 50, -20, 0, 30, 40, 60, 10 };

        boolean result = (num_arr.length >= 2 && num_arr[0] == num_arr[num_arr.length - 1]);

        System.out.println(result);

    }
}