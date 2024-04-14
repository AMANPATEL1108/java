public class Lcmoftwonumber {
    public static void main(String[] args) {
        int a = 4,
                b = 8;
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        int lcm = (a * b) / gcd;
        System.out.println("The LCM of the two given number is " + lcm);
    }
}
