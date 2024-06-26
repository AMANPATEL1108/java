public class Friendspairing {
    public static void main(String[] args) {
        System.out.println(Friend(3));

    }

    public static int Friend(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        // int fnm1 = Friend(n - 1);

        // int fnm2 = Friend(n - 2);

        // int pairway = (n - 1) * fnm2;

        // int toWays = fnm1 + pairway;
        // return toWays;

        return Friend(n - 1) + (n - 1) * Friend(n - 2);
    }
}
