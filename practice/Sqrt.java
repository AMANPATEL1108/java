package practice;

import java.util.Scanner;

/**
 * Sqrt
 */
public class Sqrt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number:");
        int num = sc.nextInt();

        System.out.println("sqrt is:" + Math.sqrt(num));

    }
}