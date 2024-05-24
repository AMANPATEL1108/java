import java.util.Scanner;

public class instancemethod {

    private double radius;

    public instancemethod(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of circle x: ");
        double x = scanner.nextDouble();

        instancemethod a = new instancemethod(x);
        double area1 = a.calculateArea();
        System.out.println("Area of circle A: " + area1);

        // System.out.print("Enter the radius of circle y: ");
        // double y = scanner.nextDouble();
        // instancemethod b = new instancemethod(y);
        // double area2 = b.calculateArea();
        // System.out.println("Area of circle B: " + area2);

    }
}
