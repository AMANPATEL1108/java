public class Clearrangeofbit {
    public static void main(String[] args) {
        System.out.println(clearrange(10, 2, 7));

    }

    public static int clearrange(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitmask = a | b;

        return n & bitmask;
    }
}
