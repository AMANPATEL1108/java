package practice;

import java.util.Scanner;

public class Abs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no:");
        int num = sc.nextInt();

        System.out.println("Abs Value is :" + Math.abs(num));// return positibe valir
    }
}
