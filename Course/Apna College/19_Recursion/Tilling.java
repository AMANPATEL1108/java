public class Tilling {
    public static void main(String[] args) {
        System.out.println(tilingprob(4));
    }

    public static int tilingprob(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = tilingprob(n - 1);

        int fnm2 = tilingprob(n - 2);

        int toWays = fnm1 + fnm2;

        return toWays;

    }
}
