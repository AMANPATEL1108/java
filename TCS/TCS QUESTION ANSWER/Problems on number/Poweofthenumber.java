public class Poweofthenumber {
    public static void main(String[] args) {
        int n = 5, k = 3;
        int ans = 1;
        for (int i = 0; i < k; i++) {
            ans = ans * n;
        }
        System.out.println(n + " raised to the power" + k + " is" + ans);
    }
}
