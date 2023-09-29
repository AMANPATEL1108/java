import java.util.Scanner;

/**
 * functiondeclare
 */
public class staticemethod {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter no a:");
        int a = sc.nextInt();

        System.out.println("enter no b:");
        int b = sc.nextInt();

        int result = add(a, b);
        System.out.println("output:" + result);

    }
}