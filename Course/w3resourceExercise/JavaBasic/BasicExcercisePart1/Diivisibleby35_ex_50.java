public class Diivisibleby35_ex_50 {
    public static void main(String[] args) {
        System.out.println("Divisible by 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i);
                System.out.print(",");

            }
        }
        System.out.println();

        System.out.println("Divisible by 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i);
                System.out.print(",");
            }
        }
        System.err.println();

        System.out.println("Divisible by 3&5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i);
                System.out.print(",");
            }
        }
    }
}
