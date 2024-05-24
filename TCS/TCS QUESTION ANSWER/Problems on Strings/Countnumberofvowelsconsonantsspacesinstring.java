public class Countnumberofvowelsconsonantsspacesinstring {
    public static void solve(String str, int length) {
        int vowels = 0, conssonants = 0, whitespaces = 0;
        str = str.toLowerCase();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else if (ch >= 'a' && ch <= 'z')
                conssonants++;
            else if (ch == ' ')
                whitespaces++;
        }

        System.out.println("Vowels:" + vowels);
        System.out.println("Consonants:" + conssonants);
        System.out.println("White Spaces:" + whitespaces);
    }

    public static void main(String[] args) {

        String str = "Take u forward is Awesome";
        int length = str.length();
        solve(str, length);
    }
}
