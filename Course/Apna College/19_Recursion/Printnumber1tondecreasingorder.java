public class Printnumber1tondecreasingorder {
    public static void main(String[] args) {
        int n = 10;
        Printdec(n);

    }

    public static void Printdec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;

        }

        System.out.println(n + " ");

        Printdec(n - 1);
    }

}
