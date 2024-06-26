public class FindPermutation {
    public static void main(String[] args) {
        String str = "abc";
        parmutation(str, "");

    }

    public static void parmutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String NewStr = str = str.substring(0, i) + str.substring(i + 1);
            parmutation(NewStr, ans + curr);
        }
    }
}
