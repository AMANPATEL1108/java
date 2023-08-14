import java.util.ArrayList;
import java.util.Scanner;

public class addorremoveelement {
    public static void main(String[] args) {

        int[] array = { 12, 13, 14 };

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int num : array) {
            numbers.add(num);
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        System.out.println("Enter '+' add or Enter'-'  remove");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                numbers.add(n);
                System.out.println(n + " added.");
                break;

            case '-':
                if (numbers.contains(n)) {
                    numbers.remove(Integer.valueOf(n));
                    System.out.println(n + " removed.");
                } else {
                    System.out.println(n + " not found.");
                }
                break;
        }
    }
}
