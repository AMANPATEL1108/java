import java.util.*;
import java.lang.*;
import java.io.*;

class Averagethreevalue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        double a = sc.nextFloat();
        System.out.println("Enter second value");
        double b = sc.nextFloat();
        System.out.println("Enter third value");
        double c = sc.nextFloat();

        double d = a + b + c / 3;
        System.out.println("average of this :" + d);

    }

}
