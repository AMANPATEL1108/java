import java.util.*;

public class largestofthreeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a  no:");
        int a = sc.nextInt();
        System.out.println("enter b  no:");
        int b = sc.nextInt();
        System.out.println("enter c  no:");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("a is largest");
        } else if (b > c) {
            System.out.println("b is largest");
        } else {
            System.out.println("c is largest");
        }
    }
}
