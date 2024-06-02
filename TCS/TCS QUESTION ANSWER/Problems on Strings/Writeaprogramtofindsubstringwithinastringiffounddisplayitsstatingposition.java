public class Writeaprogramtofindsubstringwithinastringiffounddisplayitsstatingposition {
    public static int foundpattern(String text, String pattern) {
        int N = text.length();
        int M = pattern.length();

        for (int i = 0; i < N; i++) {
            int temp = i;
            int j = 0;
            for (j = 0; j < M; j++) {
                if (text.charAt(temp) != pattern.charAt(j)) {
                    break;
                }
                temp++;

            }
            if (j == M) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "takeuforward";
        String pattern = "forward";

        int foundIdx = foundpattern(text, pattern);
        System.out.println("The String starts from the index:" + foundIdx);
    }
}
