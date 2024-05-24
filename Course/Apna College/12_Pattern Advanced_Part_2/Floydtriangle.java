public class Floydtriangle {
    public static void main(String[] args) {
        inverted(5);

    }

    public static void inverted(int n) {

        int counter = 1;

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + "");
                counter++;

            }

            System.out.println();

        }

    }
}
