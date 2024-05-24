import java.util.Scanner;

public class Productab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a product a:");
        int a = sc.nextInt();

        System.out.println("Enter a product b:");
        int b = sc.nextInt();

        int product = a * b;
        System.out.println("product is :" + product);
    }
}
