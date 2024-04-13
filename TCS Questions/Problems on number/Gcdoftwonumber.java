public class Gcdoftwonumber {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + "and " + num2 + "is " + result);
    }
}
