import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pi = 3.14F;

        System.out.println("enter a radius:");
        float radius = sc.nextFloat();

        float area = pi * radius * radius;

        System.out.println("area is:" + area);
    }
}
