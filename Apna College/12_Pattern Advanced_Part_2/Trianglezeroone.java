public class Trianglezeroone {
    public static void main(String[] args) {
        inverted(5);

    }

    public static void inverted(int n) {

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("1");

                } else {
                    System.out.print("0");
                }

            }

            System.out.println();

        }

    }
}
