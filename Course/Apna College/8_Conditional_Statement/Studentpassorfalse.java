import java.util.Scanner;

public class Studentpassorfalse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  no:");
        int marks = sc.nextInt();

        String type = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println(type);
    }

}
