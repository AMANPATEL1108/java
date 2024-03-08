import java.util.Scanner;

public class CallbyValue {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swap value is a:" + a + " and b:" + b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a value is a:");
        int a = sc.nextInt();

        System.out.println("enter a value is b:");
        int b = sc.nextInt();

        swap(a, b);

    }
}
