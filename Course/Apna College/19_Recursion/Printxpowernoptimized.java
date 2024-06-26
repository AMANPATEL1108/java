
public class Printxpowernoptimized {
    public static void main(String[] args) {

        System.out.println(power(2, 10));

    }

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpowersq = power(a, n / 2) * power(a, n / 2);

        if (n % 2 != 0) {
            halfpowersq = a * halfpowersq;
        }
        return halfpowersq;

    }
}
