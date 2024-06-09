public class Writeajavaprogramtocountlettersspacesnumbersandothercharactersininputstring_ex_38 {

    public static void main(String[] args) {
        String test = "AMAN 123";

        cout(test);
    }

    public static void cout(String test) {
        char[] ch = test.toCharArray();

        int letters = 0, spaces = 0, numbers = 0, others = 0;
        for (int i = 0; i < ch.length; i++) {

            if (Character.isLetter(ch[i])) {
                letters++;
            } else if (Character.isDigit(ch[i])) {
                numbers++;
            } else if (Character.isSpaceChar(ch[i])) {
                spaces++;
            } else {
                others++;

            }
        }

        System.out.println("the String is " + test);

        System.out.println("the letters are " + letters);
        System.out.println("the spaces are " + spaces);
        System.out.println("the numbers are " + numbers);
        System.out.println("the others are " + others);
    }

}