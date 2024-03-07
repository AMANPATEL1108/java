import java.util.Scanner;

public class Elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a  no:");
        int a = sc.nextInt();

        if (a >= 18) {
            System.out.println("you are adult");
        } else if (a >= 13 && a < 18) {
            System.out.println("you are teenager");
        } else {
            System.out.println("you are child");
        }
    }
}
