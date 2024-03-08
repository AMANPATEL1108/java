import java.util.Scanner;

public class Reversegivennumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number:");
        int n = sc.nextInt();

        int rev = 0;

        // using for loop

        for (int i = 0; n > 0; i++) {
            int lastdigit = n % 10;
            rev = rev * 10 + lastdigit;
            n = n / 10;

        }

        // using while loop

        // while (n > 0) {
        // int lastdigit = n % 10;

        // rev = rev * 10 + lastdigit;
        // n = n / 10;

        // }

        System.out.print(rev);

    }
}
