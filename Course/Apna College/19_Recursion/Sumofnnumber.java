public class Sumofnnumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Sum(n));

    }

    public static int Sum(int n) {

        if (n == 1) {
            return 1;
        }

        int sum1 = Sum(n - 1);
        int sn = n + sum1;

        return sn;
    }
}
