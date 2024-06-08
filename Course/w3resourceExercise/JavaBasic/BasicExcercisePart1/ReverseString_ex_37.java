import java.util.Scanner;

public class ReverseString_ex_37 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        char[] letters = sc.nextLine().toCharArray();

        System.out.println("Reverse of the string is");

        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);

        }

    }
}
