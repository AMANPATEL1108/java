public class Writeaprogramtosortchracterinastring {
    public static String solve(String str, int n) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        String ans = new String(arr);
        return ans;
    }

    public static void main(String[] args) {
        String str = "zxcbg";
        int n = str.length();

        System.out.println("Befor sortinng:");
        System.out.println(str);
        System.out.println("After Sorting:");
        System.out.println(solve(str, n));
    }
}
