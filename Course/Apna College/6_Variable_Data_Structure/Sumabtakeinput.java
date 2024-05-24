import java.util.Scanner;

public class Sumabtakeinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter a a:");
        int a = sc.nextInt();

        System.out.println("enter a b:");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("sum is:" + sum);
    }
}
