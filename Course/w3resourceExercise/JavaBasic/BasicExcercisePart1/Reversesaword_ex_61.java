public class Reversesaword_ex_61 {
    public static void main(String[] args) {
        String word = "aman";
        String nstr = " ";
        char ch;

        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            nstr = ch + nstr;

        }

        System.out.println("reversed Word:" + nstr);
    }

}
