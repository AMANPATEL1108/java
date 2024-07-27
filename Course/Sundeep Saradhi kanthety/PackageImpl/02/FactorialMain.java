package PackageImpl.02.Factorial;

import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Factorial obj = new FactorialMain();
        System.out.println("Enter n Number");
        int n = sc.nextInt();
        obj.Fact(n);
    }
}
