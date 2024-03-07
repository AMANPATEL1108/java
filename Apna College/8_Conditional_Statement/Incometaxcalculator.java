import java.util.Scanner;

public class Incometaxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a first no:");
        int income = sc.nextInt();
        int tax;

        if (income < 500000) {
            tax = 0;
            // System.out.println("0% tax:" + tax);
        } else if (income >= 500000 && income <= 1000000) {
            tax = (int) (income * 0.2);
            // System.out.println("you have 20% tax=" + tax);

        } else {
            tax = (int) (income * 0.3);
            // System.out.println("you have 20% tax=" + tax);

        }

        System.out.println("you tax is :" + tax);
    }
}
