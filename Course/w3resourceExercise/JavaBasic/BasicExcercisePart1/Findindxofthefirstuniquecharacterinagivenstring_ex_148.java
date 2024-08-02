public class Findindxofthefirstuniquecharacterinagivenstring_ex_148 {
    public static void main(String[] args) {
        String str = "wresources";
        System.out.println("Original String" + str);
        System.out.println("First unique character of the above:" + first_Uniq_Char(str));
    }

    public static int first_Uniq_Char(String str) {
        int[] freq = new int[256];

        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
