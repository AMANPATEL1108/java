public class Removesspacesfromastring {
    static int removeSpacces(char[] str) {
        int count = 0;
        for (int i = 0; i < str.length; i++)
            if (str[i] != ' ') {
                str[count] = str[i];
                count++;

            }
        return count;
    }

    public static void main(String[] args) {
        char[] str = "Take you forward".toCharArray();
        int count = removeSpacces(str);
        System.out.println(String.valueOf(str).subSequence(0, count));
    }
}
