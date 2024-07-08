public class Checkifthevalue20apperarsthreetimesandno20sarenexttoeachotherinthegivenarrrayinteger_ex_98 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 10, 20, 40, 13, 20 };
        int count = 0;
        int result = 0;

        if (arr.length >= 1 && arr[0] == 20) {
            count++;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == 20 && arr[i] == 20) {
                System.out.println(String.valueOf(false));
                result = 1;
            }

            if (arr[i] == 20) {
                count++;
            }
        }

        if (result == 0) {
            System.out.println(String.valueOf(count == 3));
        }
        System.out.println();
    }
}
