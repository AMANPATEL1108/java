import java.util.Scanner;

public class SwitchStatment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enteer a 1 to 6 value ");
        System.out.println("enter a  no:");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("a is equal 1");

                break;
            case 2:
                System.out.println("a is equal 2");
                break;
            case 3:
                System.out.println("a is equal 3");

                break;
            case 4:
                System.out.println("a is equal 4");

                break;
            case 5:
                System.out.println("a is equal 5");

                break;
            case 6:
                System.out.println("a is equal 6");

                break;

            default:

                System.out.println("enter a valid number");
                break;
        }
    }
}
