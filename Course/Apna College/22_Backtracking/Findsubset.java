public class Findsubset {
    public static void main(String[] args) {
        String str = "abc";
        subset(str, "", 0);
    }

    public static void subset(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return; // Ensure both base case and output are handled before returning
        }

        // Not including the current character
        subset(str, ans, i + 1);
        // Including the current character
        subset(str, ans + str.charAt(i), i + 1);
    }
}
