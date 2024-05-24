package practice;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        System.out.println("hello");

        Scanner asd = new Scanner(System.in);

        System.out.println("Enter the name");
        String name = asd.nextLine();

        System.out.println("you name is:" + name);
    }
}
