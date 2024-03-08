import java.util.Scanner;

public class Onetonn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a range:");
        int a = sc.nextInt();

        int start = 1;
        while (start <= a) {
            System.out.println(start);
            start++;
        }
    }
}
