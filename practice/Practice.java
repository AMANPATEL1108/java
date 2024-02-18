
import java.util.Scanner;

/**
 * Practice
 */
public class Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number:");
        int no1 = sc.nextInt();
        System.err.println("enter a second number:");
        int no2 = sc.nextInt();

        int add = no1 + no2;
        int sub = no1 - no2;
        int mul = no1 * no2;
        int div = no1 / no2;

        System.out.println("enter the operation:add,sub,mul,divi");
        String total = sc.next();

        switch (total) {
            case "add":
                System.out.println("total= " + add);
                break;
            case "sub":
                System.out.println("total= " + sub);
                break;
            case "mul":
                System.out.println("total= " + mul);
                break;
            case "div":
                System.out.println("total= " + div);
                break;

            default:
                System.out.println("invalid");
                break;
        }
    }
}