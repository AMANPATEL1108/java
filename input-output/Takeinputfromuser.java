import java.util.Scanner;

public class Takeinputfromuser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a value a:");
        int a = sc.nextInt();

        System.out.println("enter a value b:");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("a+b=" + sum);

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("enter a firstname:");
        String firstname = sc.next();

        System.out.println("enter a lastname:");
        String lastname = sc.next();

        // String fullname = firstname + lastname;
        // System.out.println("fullName:=" + fullname);
        System.out.println("fullName:=" + firstname + " " + lastname);

    }
}
