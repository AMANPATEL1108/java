
import java.util.Scanner;

public class Addthedigitsofgivenpositiveintegeruntiltheresulthasasingledigit_ex_108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input to Positive Integr:");

        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("The single digit is:" + (n == 0 ? 0 : (n % 9 == 0 ? 9 : n % 9)));
        }
    }
}
