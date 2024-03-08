import java.util.Scanner;

public class Productaandb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a:");
        int a = sc.nextInt();

        System.out.println("enter b:");
        int b = sc.nextInt();

        int total = mul(a, b);
        System.out.println("a*b=" + total);

    }

    public static int mul(int a, int b) {

        int multiply = a * b;
        return multiply;

    }
}
