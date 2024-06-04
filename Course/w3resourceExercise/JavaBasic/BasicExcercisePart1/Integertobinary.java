import java.util.Scanner;

public class Integertobinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a a:");
        int a = sc.nextInt();
        // System.out.println("Enter a b:");
        // String b=sc.nextLine();
        String binaryString = Integer.toBinaryString(a);
        // int decimal1=Integer.parseInt(a,2);
        // int decimal2=Integer.parseInt(b,2);

        // int sum=decimal1+decimal2;

        // String binarysum=Integer.toBinaryString(sum);

        System.out.println("total binary sum is :" + binaryString);
    }
}