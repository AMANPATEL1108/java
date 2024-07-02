import java.util.PriorityQueue;

public class Slidingwindowmaximum {

    static class Pair implements Comparable<Pair> {
        int val;
        int idx;

        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) {
            // For max-heap behavior, we need to reverse the order
            return p2.val - this.val;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int res[] = new int[arr.length - k + 1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // Add first k elements to the priority queue
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }

        // First maximum value in the sliding window
        res[0] = pq.peek().val;

        // Process the remaining elements
        for (int i = k; i < arr.length; i++) {
            // Remove elements not within the sliding window
            while (!pq.isEmpty() && pq.peek().idx <= (i - k)) {
                pq.remove();
            }
            // Add the current element
            pq.add(new Pair(arr[i], i));
            // The current maximum value in the sliding window
            res[i - k + 1] = pq.peek().val;
        }

        // Print the result
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
