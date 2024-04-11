/**
 * Chckifnumberisastrongornot
 */
public class Chckifnumberisastrongornot {
    static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static int Strong_No(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + Factorial(digit);
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 145;
        int answer = Strong_No(number);
        if (answer == number && number != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}