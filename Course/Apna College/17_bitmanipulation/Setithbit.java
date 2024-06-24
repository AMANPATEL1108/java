public class Setithbit {

    public static void main(String[] args) {
        System.out.println(setIt(10, 2));

    }

    public static int setIt(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }
}