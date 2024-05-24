public class Sumofdigitsofanumber {
    static private int getsum(int n) {
        int d;
        int sum = 0;
        while (n != 0) {
            d = n % 10;
            sum += d;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 472;
        System.out.println("Sum of digits of the given number is " + getsum(n));

    }
}
