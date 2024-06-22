import java.util.Scanner;

public class Calculateamoduleofttwonumberwithoutusinginbulitfunction_ex_66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int a = in.nextInt();
        System.out.print("Input the second number: ");
        int b = in.nextInt();

        int divide = a / b;

        int result = a - (divide * b);

        System.out.println(result);
    }
}
