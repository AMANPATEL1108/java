import java.util.Scanner;

public class cal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st no:");
        int first = sc.nextInt();

        System.out.println("enter 2nd no:");
        int second = sc.nextInt();

        System.out.println("+ for addition");
        System.out.println("- for substraction");
        System.out.println("* for multiplication");
        System.out.println("/ for division");

        char choice = sc.next().charAt(0);

        double total = 0;

        switch (choice) {
            case '+':
                total = first + second;
                System.out.println("total=" + total);
                break;
            case '-':
                total = first - second;
                System.out.println("total=" + total);
                break;
            case '*':
                total = first * second;
                System.out.println("total=" + total);
                break;
            case '/':
                total = first / second;
                System.out.println("total=" + total);
                break;

            default:
                System.out.println("enter a proper number");
                break;
        }

    }
}
