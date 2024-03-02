import java.util.Scanner;

public class Octaltodecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a a:");
        String a = sc.nextLine();

        int decimal = Integer.parseInt(a, 8);

        System.out.println("total binary sum is :" + decimal);
    }
}