import java.util.*;

class Findareapraremeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a width:");
        double w = sc.nextDouble();

        System.out.println("Enter a height:");

        double h = sc.nextDouble();

        double p = 2 * (h + w);
        double a = w * h;

        System.out.println("Area is: " + a);
        System.out.println("Perimeter is: " + p);
    }
}
