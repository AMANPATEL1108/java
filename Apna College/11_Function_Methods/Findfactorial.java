import java.util.Scanner;

public class Findfactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number to find factorial");
        int a = sc.nextInt();

        int fac = factorial(a);
        System.out.println("factorial is :" + fac);

    }

    public static int factorial(int a) {
        int t = 1;
        for (int i = 1; i <= a; i++) {
            t = t * i;

        }
        return t;

    }
}
