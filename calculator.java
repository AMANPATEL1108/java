import java.util.Scanner;

/**
 * calculator
 */
public class calculator {

    public static void main(String[] args) {

        double num1;
        double num2;
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter no1:");
        num1 = sc.nextDouble();
        System.out.println(" Enter no2:");
        num2 = sc.nextDouble();

        System.out.println("Enter the operator (+,-,*,/):");

        char total = sc.next().charAt(0);
        double o = 0;
        switch (total) {
            case '+':
                o = (num1 + num2);
                break;

            case '-':
                o = (num1 - num2);
                break;

            case '*':
                o = (num1 * num2);
                break;

            case '/':
                o = (num1 / num2);
                break;

            default:
                System.out.println("You enter wrong input");
        }
        System.out.println(num1 + " " + total + " " + num2 + " = " + o);

    }
                   
}
