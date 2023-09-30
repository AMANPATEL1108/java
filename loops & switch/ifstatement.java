import java.util.Scanner;

public class ifstatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter age:");
        int a = sc.nextInt();

        if (18 < a) {
            System.out.println("is adult");

        } else {
            System.out.println("not adult");
        }
    }
}
