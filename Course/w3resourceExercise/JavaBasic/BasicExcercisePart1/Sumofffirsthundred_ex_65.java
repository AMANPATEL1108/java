public class Sumofffirsthundred_ex_65 {
    public static void main(String[] args) {

        int sum = 1;
        int ctr = 0;
        int n = 0;
        while (ctr < 100) {
            n++;

            if (n % 2 != 0) {
                if (is_prime(n)) {
                    sum += n;

                }
            }
            ctr++;

        }
        System.out.println("Sum of first 100 prime numbers is : " + sum);
    }

    public static boolean is_prime(int n) {
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

}