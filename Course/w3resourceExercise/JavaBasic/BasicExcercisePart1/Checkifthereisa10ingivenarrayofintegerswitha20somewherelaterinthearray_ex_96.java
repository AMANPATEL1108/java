public class Checkifthereisa10ingivenarrayofintegerswitha20somewherelaterinthearray_ex_96 {
    public static void main(String[] args) {
        int arr[] = { 10, 70, 80, 50, 20, 13, 50 };

        boolean tested = false;
        int result = 0;
        int x = 10;
        int y = 20;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                tested = true;
            }
            if (tested && arr[i] == y) {
                System.out.println(String.valueOf(true));
                result = 1;
            }
        }
        if (result == 0) {
            System.out.println(String.valueOf(false));
        }
        System.out.println();
    }
}
