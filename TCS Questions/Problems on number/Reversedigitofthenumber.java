public class Reversedigitofthenumber {

    static private int Rev(int n) {

        int d;
        int rev = 0;
        while (n != 0) {
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int n = 472;
        System.out.println("The Reverse number is :" + Rev(n));

    }
}
