public class Sumoffirstnnaturalnumber {
    public static void main(String[] args) {
        int n = 5;
        int total = 0;

        for (int i = 0; i <= n; i++) {
            total = i + total;
        }
        System.out.println(total);
    }
}
