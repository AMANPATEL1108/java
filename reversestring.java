import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");

        String a = sc.nextLine();

        String reversed = new StringBuilder(a).reverse().toString();

        System.out.println("yout reverse String is:" + reversed);

    }
}
