package practice;

import java.util.Scanner;

/**
 * Maxmin
 */
public class Maxmin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number 1:");
        int num1 = sc.nextInt();

        System.out.println("enter a number 2:");
        int num2 = sc.nextInt();

        System.out.println("maximum no is :" + Math.max(num1, num2));
        System.out.println("maximum no is :" + Math.min(num1, num2));

    }
}x