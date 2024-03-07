public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';

        System.out.println((int) (b));
        System.out.println((int) (a));
        System.out.println(a);
        System.out.println(b - a);

        System.out.println("----------------------");

        short x = 5;
        byte y = 25;
        char z = 'c';
        byte bt = (byte) (x + y + z);
        System.out.println(bt);

        System.out.println("---------------------------");
        int p = 10;
        float q = 20.25f;
        long r = 25;
        double s = 30;
        double ans = p + q + r + s;
        System.out.println(ans);

        System.out.println("---------------------");
        byte l = 5;
        byte m = (byte) (l * 2);

        System.out.println(m);
    }
}
