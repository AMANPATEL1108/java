public class Butterflypattern {

    public static void main(String[] args) {
        butterfly_pattern(4);

    }

    public static void butterfly_pattern(int n) {

        for (int i = 1; i <= n; i++) {
            // print star-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // print spaces-2 * (n - i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // print star-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }

        for (int i = n; i >= 1; i--) {
            // print star-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // print spaces-2 * (n - i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // print star-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }

    }
}
