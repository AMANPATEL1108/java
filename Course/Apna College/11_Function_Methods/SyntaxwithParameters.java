import java.util.Scanner;

public class SyntaxwithParameters {

    public static int add(int num1, int num2) {

        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A:");
        int a = sc.nextInt();

        System.out.println("Enter B:");
        int b = sc.nextInt();

        int sum = add(a, b);
        System.out.println("sum is " + sum);
    }
}
