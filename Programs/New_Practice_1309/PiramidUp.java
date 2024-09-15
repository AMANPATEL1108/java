public class PiramidUp {
    public static void main(String[] args) {
        int n = 5;

        // for left side half

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
        // -----for right side half\

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= n; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // --for full

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= n; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // for down full

        for (int i = n; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        // for left side full
       
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}