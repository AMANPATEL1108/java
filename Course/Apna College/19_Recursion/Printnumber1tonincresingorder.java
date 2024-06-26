public class Printnumber1tonincresingorder {
    public static void main(String[] args) {
        int n = 10;
        Printinc(n);

    }

    public static void Printinc(int n) {
        if (n == 1) {
            System.out.println(n + " ");
            return;

        }
        Printinc(n - 1);

        System.out.println(n + " ");

    }
}
