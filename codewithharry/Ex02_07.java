package codewithharry;

import java.util.Scanner;

public class Ex02_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a kilometer:");
        float kilometer = sc.nextFloat();

        float miles = kilometer * 0.621F;

        System.out.println(kilometer + ":Kilometer=" + miles + ":Miles");

    }
}
