import java.util.Scanner;

public class acceptvaluesiftureoneis20ormoreless_ex_62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value 1:");
        int a = sc.nextInt();
        System.out.println("Enter value 2:");
        int b = sc.nextInt();
        System.out.println("Enter value 3:");
        int c = sc.nextInt();

        if (a > 20 || b > 20 || c > 20) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

    }
}
