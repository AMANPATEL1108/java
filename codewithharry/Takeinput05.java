package codewithharry;

import java.util.Scanner;

/**
 * takeinput05
 */
public class Takeinput05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("enter a a:");
        // int a = sc.nextInt();

        // System.out.println("enter a b:");
        // int b = sc.nextInt();

        // int c = a + b;

        // System.out.println("total a+b=" + c);

        System.out.println("enter a first name:");
        String first = sc.nextLine();

        System.out.println("enter a last name:");
        String last = sc.nextLine();

        String fullname = first + last;

        System.out.println("full Name  : " + fullname);

    }
}