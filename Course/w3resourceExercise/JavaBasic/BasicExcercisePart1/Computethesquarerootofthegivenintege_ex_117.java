import java.util.Scanner;

public class Computethesquarerootofthegivenintege_ex_117 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a positive Integer:");
        int n = sc.nextInt();

        System.out.println("Square root of " + n + "is");

        System.out.println(sqrt(n));
    }

    private static int sqrt(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        int a = 0;
        int b = num;

        while (a <= b) {
            int mid = (a + b) >> 1;
            if (num / mid < mid) {
                b = mid - 1;
            } else {
                if (num / (mid + 1) <= mid) {
                    return mid;
                }
                a = mid + 1;
            }
        }
        return a;
    }

}
