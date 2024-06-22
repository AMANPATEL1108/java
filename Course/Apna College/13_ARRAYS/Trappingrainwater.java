public class Trappingrainwater {

    public static int calculate(int height[]) {

        int n = height.length;
        // calculate left max boundy-aray

        int leftMax[] = new int[n];

        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundry-array

        int rightmax[] = new int[n];

        rightmax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        // loop
        int trappwater = 0;
        for (int i = 0; i < n; i++) {
            // Water level=min(leftmaxb ound,rightmax bound)

            int waterLevel = Math.min(leftMax[i], rightmax[i]);
            // traper water=waterLevel -height

            trappwater += waterLevel - height[i];
        }
        return trappwater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(calculate(height));
    }
}
