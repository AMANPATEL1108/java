import java.util.Scanner;

/**
 * switchhhh
 */
public class switchhhh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a day:");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("it a sunday");
                break;
            case 2:
                System.out.println("it a monday");
                break;

            case 3:
                System.out.println("it a tuesday");
                break;
            case 4:
                System.out.println("it a wedsenday");
                break;
            case 5:
                System.out.println("it a thurseday");
                break;
            case 6:
                System.out.println("it a friday");
                break;
            case 7:
                System.out.println("it a saturday");
                break;

            default:
                System.out.println("it a error");
                break;
        }
    }
}