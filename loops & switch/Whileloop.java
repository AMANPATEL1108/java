import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {

        int i = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no:");
        int n = sc.nextInt();

        while (i <= n) {
            System.out.println("value is:" + i);
            i++;
        }
    }
}
