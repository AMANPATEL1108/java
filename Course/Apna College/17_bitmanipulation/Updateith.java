public class Updateith {
    public static void main(String[] args) {
        System.out.println(updateIt(10, 2, 1));

    }

    public static int updateIt(int n, int newbit, int i) {
        // if (newbit == 0) {
        // return clearIt(n, i);
        // } else {
        // return setIt(n, i);

        // }
        n = clearIt(n, i);
        int bitmask = newbit << i;
        return n | bitmask;
    }

    public static int clearIt(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int setIt(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }
}
