import java.util.Scanner;

/**
 * sumofnno
 */
public class fibonaci {

    public static void main(String[] args) {
        int one = 0;
        int two = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        sum += one;

        for (int i = 0; i < num; i++) {
            System.out.print(one + " ");
            int next = one + two;
            one = two;
            two = next;
        }

        System.out.println();

    }
}