import java.util.ArrayList;
import java.util.Arrays;

public class FindalloftheLongestwordinagivendictionary_ex_138 {

    static ArrayList longestWords(String[] dictonary) {
        ArrayList list = new ArrayList<>();
        int loneest_length = 0;

        for (String str : dictonary) {
            int length = str.length();

            if (length > loneest_length) {
                loneest_length = length;
                list.clear();

            }
            if (length == loneest_length) {
                list.add(str);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] dict = { "cat", "dog", "red", "is", "am" };
        System.out.println("Original dictionary: " + Arrays.toString(dict));
        System.out.println("Longest word(s) of the above dictionary: " + longestWords(dict));

    }
}
