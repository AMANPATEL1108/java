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

        // for (int i = 0; i <= n; i++) {

        // System.out.println();

        // }

        // for (int i = 0; i <= n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

    }

}
