import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a a no:");
        int a = sc.nextInt();

        System.out.println("enter a b no:");
        int b = sc.nextInt();

        if (a < b) {

            System.out.println(b + ":b is largest number");

        } else {
            System.out.println(a + ":a is largest number");
        }
    }
}
