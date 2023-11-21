import java.util.Scanner;

public class normal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a fist no:");
        int firstno = sc.nextInt();

        System.out.println("ente a  second no:");
        int seccondno = sc.nextInt();

        int total = firstno + seccondno;

        System.out.println("total=" + total);

    }
}
