import java.util.Scanner;

public class PrintSquarepattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a lines of pattern:");
        int n = sc.nextInt();

        // using for loop
        for (int i = 0; i <= n; i++) {
            System.out.println("****");
        }

        // using while loop
        // int i = 1;
        // while (i <= n) {
        // System.out.println("****");
        // i++;
        // }
    }
}
