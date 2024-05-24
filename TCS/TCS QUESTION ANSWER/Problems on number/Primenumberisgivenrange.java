public class Primenumberisgivenrange {

    public static boolean isPrime(int num) {
        if (num == 1)
            return false;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void PrintPrimeinrange(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        int a = 10, b = 17;
        PrintPrimeinrange(a, b);

    }
}
