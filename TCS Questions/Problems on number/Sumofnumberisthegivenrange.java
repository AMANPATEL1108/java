public class Sumofnumberisthegivenrange {
    public static void main(String[] args) {
        int l = 2;
        int r = 7;
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += i;
        }
        System.out.println("The sum of the number in the given range is " + sum);
    }
}
