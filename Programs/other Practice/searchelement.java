import java.util.Scanner;

/**
 * searchelement
 */
public class searchelement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] a = { "12", "13", "14", "15", "16" };

        System.out.println("enter search no:");
        String searchNo = sc.nextLine();

        boolean found = true;

        for (int i = 0; i < a.length; i++) {
            if (searchNo.equals(a[i]))
                found = true;
            break;

        }

        if (found) {
            System.out.println("no is in");

        } else {
            System.out.println("no is not in");
        }
    }
}
