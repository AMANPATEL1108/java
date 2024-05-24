import java.util.Scanner;

public class Printreversnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number:");
        int n = sc.nextInt();

        // using forloop

        // for (int i = 0; n > i; i++) {

        // int lastdigit = n % 10;
        // System.out.print(lastdigit);
        // n = n / 10;

        // }
        // System.out.println(n);

        // using while loop

        int i = 0;
        while (n > i) {
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;

        }

    }
}
