package practice;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a day:");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Today is sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is tuesday");
                break;
            case 4:
                System.out.println("Today is wednseday");
                break;
            case 5:
                System.out.println("Today is thursday");
                break;
            case 6:
                System.out.println("Today is friday");
                break;
            case 7:
                System.out.println("Today is saturday");
                break;

            default:
                System.out.println("Enter a valid day");
                break;
        }
    }
}
