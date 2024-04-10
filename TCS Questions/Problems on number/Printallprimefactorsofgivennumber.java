public class Printallprimefactorsofgivennumber {
    public static void printFactor(int n) {
        System.out.println("Prime Factor:");
        for (int i = 2; n > 2; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    System.out.println(i + " ");
                    n = n / i;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 60;
        printFactor(n);

    }
}
