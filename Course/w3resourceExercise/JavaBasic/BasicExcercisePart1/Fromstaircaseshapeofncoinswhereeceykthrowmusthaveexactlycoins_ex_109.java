import java.util.Scanner;

public class Fromstaircaseshapeofncoinswhereeceykthrowmusthaveexactlycoins_ex_109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INput a positive Integer:");

        int n = sc.nextInt();
        if (n > 0) {
            double sqrtResult = Math.sqrt(8 * (long) n + 1);
            int numRow = (int) ((sqrtResult - 1) / 2);
            System.out.println("Number of Rows" + numRow);

        }

    }
}
