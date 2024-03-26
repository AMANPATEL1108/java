public class Checkanumberisperfectornot {

    static boolean IsPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                sum = sum + i;
        }
        if (sum == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        boolean ex1 = IsPerfect(6);
        boolean ex2 = IsPerfect(15);
        boolean ex3 = IsPerfect(28);

        if (ex1 == true) {
            System.out.println("6 is a perfect Number");
        } else
            System.out.println("6 is a perfect Number");

        if (ex2 == true) {
            System.out.println("15 is a perfect Number");
        } else
            System.out.println("15 is not a perfect Number");

        if (ex3 == true) {
            System.out.println("28 is a perfect Number");
        } else
            System.out.println("28 is not a perfect Number");

    }

}
