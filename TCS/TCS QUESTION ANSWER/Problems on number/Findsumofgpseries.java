public class Findsumofgpseries {

    public static double suofgp(double a, double r, int n) {
        double sum = 0.0;
        for (int i = 0; i <= n; i++) {
            sum += a;
            a = a * r;

        }
        return sum;
    }

    public static void main(String[] args) {
        double a = 2.0;
        double r = 1.5;
        int n = 4;
        System.out.println("Sum of Gp Series " + suofgp(a, r, n));

    }
}
