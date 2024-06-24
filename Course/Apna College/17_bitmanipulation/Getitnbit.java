public class Getitnbit {

    public static int getIt(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
   System.out.println(getIt(10, 2));
    }
}
