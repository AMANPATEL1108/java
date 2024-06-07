import java.util.Scanner;

public class Computetheareaofhexapoligone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of polygone: ");
        int ns = sc.nextInt();

        System.out.println("Input the length of  the Sides");

        double side = sc.nextDouble();

        System.out.println("the area is:" + ploy(ns, side));
    }

    public static double ploy(int ns, double side) {
        return (ns * (side * side) / (4.0 * Math.tan(Math.PI / ns)));
    }
}
