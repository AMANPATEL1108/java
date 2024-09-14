import java.util.Arrays;

/**
 * findbigstring
 */
public class findbigstring {

    public static void main(String[] args) {
        String[] strings = { "aman", "dev", "het", "man" };

        String longestString = longest(strings);

        System.out.println("Longest string: " + longestString);
    }

    public static String longest(String[] strings) {
        String longest = strings[0];
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() > longest.length()) {
                longest = strings[i];
            }
        }
        return longest;
    }
}
