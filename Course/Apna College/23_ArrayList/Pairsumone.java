import java.util.ArrayList;

public class Pairsumone {

    // public static boolean pair(ArrayList<Integer> list, int target) {
    // for (int i = 0; i < list.size(); i++) {
    // for (int j = i + 1; j < list.size(); j++) {
    // if (list.get(i) + list.get(j) == target) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;

        // System.out.println(pair(list, target));

        System.out.println(pairsum1(list, target));
    }

    // 2 pointer approach

    public static boolean pairsum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        // case-1
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case-2
            while (lp != rp) {
                if (list.get(lp) + list.get(rp) < target) {
                    lp++;
                } else {
                    // case-3
                    rp--;
                }

            }

        }
        return false;
    }
}
