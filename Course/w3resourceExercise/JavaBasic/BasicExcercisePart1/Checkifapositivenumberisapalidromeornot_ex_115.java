import java.util.Scanner;

public class Checkifapositivenumberisapalidromeornot_ex_115 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a positive intiger:");

        int n = sc.nextInt();

        System.out.println("is" + n + "a plaidrome number");
        System.out.println(is_palidrome(n));

    }

    public static int reverse_nums(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse *= 10;
            reverse += n % 10;
            n /= 10;
        }
        return reverse;
    }

    public static boolean is_palidrome(int n) {
        return (n == reverse_nums(n));
    }
}
