public class Counttheintegerofevenandoddelementingivenarrayofinteger_ex_92 {
    public static void main(String[] args) {
        int arr[] = { 5, 7, 2, 4, 9 };
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else if (arr[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println("even is=" + even);
        System.out.println("odd is=" + odd);

    }
}
