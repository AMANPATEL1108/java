import java.util.Scanner;

public class Primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number:");
        int n = sc.nextInt();

        // for (int i = 2; i <= n - 1; i++) {
        // if (n % i == 0) {
        // System.out.println(n + "prime number");
        // break;
        // } else {
        // System.out.println("not prime");
        // break;
        // }
        //

        if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.println("n is prime number");
            } else {
                System.out.println("n is not prime");
            }
        }

    }
}