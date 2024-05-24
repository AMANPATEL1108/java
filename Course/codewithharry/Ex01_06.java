package codewithharry;

import java.util.Scanner;

public class Ex01_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("sub 1 marks:");
        float sub1 = sc.nextFloat();
        System.out.println("sub 2 marks:");
        float sub2 = sc.nextFloat();
        System.out.println("sub 3 marks:");
        float sub3 = sc.nextFloat();
        System.out.println("sub 4 marks:");
        float sub4 = sc.nextFloat();
        System.out.println("sub 5 marks:");
        float sub5 = sc.nextFloat();

        float subtotal = sub1 + sub2 + sub3 + sub4 + sub4;

        float alltotal = subtotal * 100;

        float result = alltotal / 500;

        System.out.println("result:" + result + "%");

    }
}
