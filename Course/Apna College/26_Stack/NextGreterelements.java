
import java.util.Stack;

public class NextGreterelements {

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nxtGreter[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {

                s.pop();

            }
            if (s.isEmpty()) {
                nxtGreter[i] = -1;
            } else {
                nxtGreter[i] = arr[s.peek()];
            }

            s.push(i);
        }

        for (int i = 0; i <= nxtGreter.length; i++) {
            System.out.println(nxtGreter[i] + " ");

        }
        System.out.println();
    }
}
