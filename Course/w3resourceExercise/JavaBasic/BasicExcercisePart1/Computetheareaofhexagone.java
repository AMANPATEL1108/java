import java.util.Scanner;

public class Computetheareaofhexagone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the side of hexagon: ");
            double s = sc.nextDouble();
            double area = hexa(s);
            System.out.println("Area of hexagon: " + area);
        } finally {
            sc.close();
        }
    }

    public static double hexa(double s) {
        double area = 0;
        area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
        return area;
    }
}
