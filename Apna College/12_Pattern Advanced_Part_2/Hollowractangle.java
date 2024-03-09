/**
 * Hollowractangle
 */
public class Hollowractangle {

    public static void main(String[] args) {
        holo_rect(4, 5);

    }

    public static void holo_rect(int totalrow, int totalcols) {

        for (int i = 1; i <= totalrow; i++) {
            for (int j = 1; j <= totalcols; j++) {
                if (i == 1 || i == totalrow || j == 1 || j == totalcols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }
}