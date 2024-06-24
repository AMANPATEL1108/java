public class Numberpowerof2ornotcheck {
    public static void main(String[] args) {
        System.out.println(check(8));

    }

    public static boolean check(int n) {
        return (n & (n - 1)) == 0;

    }
}
