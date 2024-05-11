/**
 * Checkgivenstringispalidromeornot
 */
public class Checkgivenstringispalidromeornot {

    static private boolean isPalidrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char l = s.charAt(left), r = s.charAt(right);
            if (!Character.isLetterOrDigit(l))
                left++;
            else if (!Character.isLetterOrDigit(r))
                right--;
            else if (Character.toLowerCase(l) != Character.toLowerCase(r))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "ABCDCBA";
        boolean ans = isPalidrome(str);

        if (ans == true) {
            System.out.println("Palidrome");
        } else {
            System.out.println("Not Palidrome");
        }
    }
}