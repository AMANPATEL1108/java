
import java.util.Scanner;

public class CheckWeatheragivenintegerisapowerog4ornot_ex_110 {
    public static void main(String[] args) {

        int test = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a positive integer: ");

        int n = sc.nextInt();
        if (n < 1) {
            System.out.print(Boolean.toString(false));
            test = 1;
        }

        if ((n & (n - 1)) != 0) {
            System.out.print(Boolean.toString(false));
            test = 1;
        }

        if (test == 0) {
            System.out.print(Boolean.toString((n & 0x55555555) != 0));
        }
        System.out.println();
    }
}
