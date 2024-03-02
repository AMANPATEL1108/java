import java.util.Scanner;

public class Binarytodecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a a:");
        String a = sc.nextLine();
        // System.out.println("Enter a b:");
        // String b=sc.nextLine();
        int decimal = Integer.parseInt(a, 2);
        // int decimal1=Integer.parseInt(a,2);
        // int decimal2=Integer.parseInt(b,2);

        // int sum=decimal1+decimal2;

        // String binarysum=Integer.toBinaryString(sum);

        System.out.println("total binary sum is :" + decimal);
    }
}