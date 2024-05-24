import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Age;");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("you are adult:drive,Vote");

        }
        if (13 < age && age < 18) {

            System.out.println("teenager");

        } else {
            System.out.println("you are not adult");
        }
    }
}