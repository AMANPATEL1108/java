public class Writeaprogramtocomputethesumofintegers {
    public static void main(String[] args) {

        int n = 123;
        int sum = Sum(n);
        System.out.println("Sum of digits: " + sum);

    }

    public static int Sum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}