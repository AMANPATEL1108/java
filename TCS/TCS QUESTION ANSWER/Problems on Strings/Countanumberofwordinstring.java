public class Countanumberofwordinstring {
    public static void main(String[] args) {
        String str = "HI AMY AND AMAN";
        int n = str.length();
        int spaces = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ')
                spaces = spaces + 1;

        }

        System.out.println("Nuber of word are :");
        System.out.println(spaces + 1);
    }
}
