public class Checkarmstromornot {

    public static boolean Armstorm(int n) {
        int originalno = n;
        int count = 0;
        int temp = n;
        while (temp != 0) {
            count++;
            temp = temp / 10;

        }
        int sumofpower = 0;
        while (n != 0) {
            int digit = n % 10;
            sumofpower += Math.pow(digit, count);
            n /= 10;
        }
        return (sumofpower == originalno);
    }

    public static void main(String[] args) {

        int n1 = 153;
        if (Armstorm(n1)) {
            System.out.println("yes ,it is Armstrong number");
        } else {
            System.out.println("No, it is not Armstrong number");
        }

    }
}
