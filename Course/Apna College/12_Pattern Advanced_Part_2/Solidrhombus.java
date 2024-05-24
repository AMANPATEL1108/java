public class Solidrhombus {
    public static void main(String[] args) {
        solid_rhomnue(5);

    }

    public static void solid_rhomnue(int n) {

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
