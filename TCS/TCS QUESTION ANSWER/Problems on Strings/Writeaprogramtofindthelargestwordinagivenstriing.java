public class Writeaprogramtofindthelargestwordinagivenstriing {
    static String maxLength(String str) {
        int len = str.length();
        int i = 0;
        int j = 0;
        String maxWord = "";
        int max_length = 0, max_start = 0;

        while (j <= len) {
            if (j < len && str.charAt(j) != ' ')
                j++;
            else {
                int curr_lenght = j - 1;

                if (curr_lenght > max_length) {
                    max_length = curr_lenght;
                    max_length = i;
                }
                j++;
                i = j;

            }
        }
        maxWord = str.substring(max_start, max_length);
        return maxWord;
    }

    public static void main(String[] args) {
        String str = "Google Docs";
        System.out.println("Largest Word is:" + maxLength(str));
    }
}
