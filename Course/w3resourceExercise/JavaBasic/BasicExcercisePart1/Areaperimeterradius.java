import java.util.*;
import java.lang.*;
import java.io.*;

// P=2πr
// A=3.14*r^2

class Main {
    public static void Areaperimeterradius(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double a = sc.nextFloat();
        double pi = 3.14159265359;
        double perimerte = (2 * pi * a);
        double area = (pi * a * a);

        System.out.println("Perimeter is =" + perimerte);
        System.out.println("Area is=" + area);

    }

}
