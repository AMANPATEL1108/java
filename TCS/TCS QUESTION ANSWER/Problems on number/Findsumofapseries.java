import java.util.Scanner;

public class Findsumofapseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a First term of ap series :");
        int firstterm = sc.nextInt();

        System.out.println("enter a comman defference of ap series");
        int difference = sc.nextInt();

        System.out.println("enter a term of ap series:");
        int term = sc.nextInt();

        int sum = getapsum(firstterm, difference, term);

        System.out.println("The sum is " + sum);
    }

    public static int getapsum(int firstterm, int difference, int term)

    {

        int sum = term * (2 * firstterm + (term - 1) * difference) / 2;

        return sum;
    }
}
