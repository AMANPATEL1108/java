public class Calculatethefrequencyofcharacterinastring {
    public static void Printdrequency(String str) {
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                System.out.print((char) (i + 'a'));
                System.out.print(freq[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "takeforward";
        Printdrequency(str);
    }
}
