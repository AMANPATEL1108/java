public class Createanewstringof4copiesofthelastthreecharacteroforiginalstring_ex_68 {
    public static void main(String[] args) {
        String main = "python 3.0";

        String lastthree = main.substring(main.length() - 3);

        System.out.println(lastthree + lastthree + lastthree + lastthree);
    }
}
