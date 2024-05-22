public class Returnmaximumoccuringcharacterintheinputstringstring {
    static char maxOccurringChar(String str) {
        char ans = 'a';
        int maxfreq = 0, n = str.length();
        int cout[] = new int[256];
        for (int i = 0; i < n; i++) {
            cout[str.charAt(i)]++;
            if (cout[str.charAt(i)] > maxfreq) {
                maxfreq = cout[str.charAt(i)];
                ans = str.charAt(i);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        String str = "takeforward";
        System.out.println("MAximum ocuring character is " + maxOccurringChar(str));
    }
}
