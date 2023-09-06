import java.util.Scanner;

public class swapingnum {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // System.out.println("enter num 1:");
        // int num1 = sc.nextInt();

        // System.out.println("enter num 2:");
        // int num2 = sc.nextInt();
        int num1 = 5;
        int num2 = 10;
        int temp;

        System.out.println("befor swaping: num1:" + num1 + "num2:" + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swaping num1:" + num1 + "num 2:" + num2);
    }
}
