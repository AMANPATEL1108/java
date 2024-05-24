import java.util.Scanner;

public class Binomialcofficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a value n:");
        int n = sc.nextInt();

        System.out.println("enter a value r:");
        int r = sc.nextInt();

        System.out.println("binomial=" + Binomial(n, r));
    }

    public static int Binomial(int n, int r) {

        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_nmr = factorial(n - r);

        int bincoeff = fac_n / (fac_r * fac_nmr);

        return bincoeff;
    }

    public static int factorial(int n) {
        int t = 1;
        for (int i = 1; i <= n; i++) {
            t = t * i;

        }

        return t;
    }
}
