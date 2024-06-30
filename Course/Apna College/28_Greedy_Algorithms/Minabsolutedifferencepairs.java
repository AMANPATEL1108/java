
import java.util.Arrays;

public class Minabsolutedifferencepairs {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3 };
        int b[] = { 2, 1, 3 };

        Arrays.sort(a);
        Arrays.sort(b);

        int midDiff = 0;
        for (int i = 0; i < a.length; i++) {
            midDiff += Math.abs(a[i] - b[i]);
        }
        System.out.println("Min dofferencce =" + midDiff);
    }
}