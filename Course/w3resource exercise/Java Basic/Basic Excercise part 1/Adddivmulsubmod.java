import java.util.*;
import java.lang.*;
import java.io.*;

class Adddivmulsubmod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a First Number:");
        int a = sc.nextInt();
        System.out.println("Enter a Second Number:");
        int b = sc.nextInt();

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;

        System.out.println("a+b=" + c);
        System.out.println("a-b=" + d);
        System.out.println("a*b=" + e);
        System.out.println("a/b=" + f);
        System.out.println("a%b=" + g);

    }
}
