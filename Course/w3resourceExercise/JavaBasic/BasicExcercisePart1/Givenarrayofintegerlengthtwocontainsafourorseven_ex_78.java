package BasicExcercisePart1;

import java.util.Arrays;

public class Givenarrayofintegerlengthtwocontainsafourorseven_ex_78 {
    public static void main(String[] args) {
        int arrnum[] = { 5, 7 };

        System.out.println("Original Array" + Arrays.toString(arrnum));

        if (arrnum[0] == 4 || arrnum[0] == 7) {
            System.out.println("True");
        } else {
            System.out.println(arrnum[1] == 4 || arrnum[1] == 7);
        }
    }
}
