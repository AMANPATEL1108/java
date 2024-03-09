public class Bonus {
    public static void main(String[] args) {
        System.out.println("------------numberpyramid-------------");
        numberpyramid(5);
        System.out.println("-----------palindromicwithnumber--------------");
        palindromicwithnumber(5);
        System.out.println("-------------------------");

    }

    public static void numberpyramid(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");

            }
            System.out.println();

        }

    }

    public static void palindromicwithnumber(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);

            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();

        }

    }
}
