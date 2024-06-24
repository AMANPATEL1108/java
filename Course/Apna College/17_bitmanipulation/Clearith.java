public class Clearith {
    public static void main(String[] args) {
        System.out.println(clearIt(10, 2));

    }

    public static int clearIt(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }
}
