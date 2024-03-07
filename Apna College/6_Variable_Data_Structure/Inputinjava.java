import java.util.Scanner;

public class Inputinjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a Name:");
        String input = sc.nextLine();

        System.out.println(input);

        System.out.println("enter a no:");
        int a = sc.nextInt();
        System.out.println("number is : " + a);

        System.out.println("enter a float:");
        float f = sc.nextFloat();
        System.out.println("number is : " + f);

        System.out.println("enter a boolean:");
        boolean b = sc.nextBoolean();
        System.out.println("number is boolean : " + b);

        System.out.println("enter a short:");
        short s = sc.nextShort();
        System.out.println("number is  short: " + s);

        System.out.println("enter a long:");
        long l = sc.nextLong();
        System.out.println("number is long : " + l);

    }
}
