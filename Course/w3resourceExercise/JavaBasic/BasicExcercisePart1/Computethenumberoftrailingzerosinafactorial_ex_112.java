import java.util.Scanner;

public class Computethenumberoftrailingzerosinafactorial_ex_112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Number:");
        int n = sc.nextInt();
        int n1 = n;
        long ctr = 0;

        while (n != 0) {
            ctr += n / 5;
            n /= 5;
        }
        System.out.println("Number of trauiing zeros of the factorial is" + ctr);
    }
}
