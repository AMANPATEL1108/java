import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a  no:");
        int a = sc.nextInt();
        System.out.println("enter a  no:");
        int b = sc.nextInt();
        System.out.println("Enter a Operators:+,-,*,/,% ");

        char operator = sc.next().charAt(0);

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        switch (operator) {
            case '+':
                System.out.println(add);

                break;
            case '-':
                System.out.println(sub);
                break;
            case '*':
                System.out.println(mul);

                break;
            case '/':
                System.out.println(div);

                break;
            case '%':
                System.out.println(mod);

                break;

            default:

                System.out.println("enter a valid Operator or number ");
                break;
        }
    }
}
