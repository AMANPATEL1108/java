import java.util.Scanner;

public class Sumofnnumer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a range:");
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum = i + sum;
            i++;
        }

        System.out.println("n number of sum is :" + sum);
    }
}
