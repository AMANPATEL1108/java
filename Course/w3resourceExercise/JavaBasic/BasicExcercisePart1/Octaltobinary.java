import java.util.Scanner;

public class Octaltobinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an octal number:");
        String octal = sc.nextLine();

        int decimal = Integer.parseInt(octal, 8); // Convert octal to decimal
        String binary = Integer.toBinaryString(decimal); // Convert decimal to binary

        System.out.println("Binary equivalent: " + binary);
    }
}
