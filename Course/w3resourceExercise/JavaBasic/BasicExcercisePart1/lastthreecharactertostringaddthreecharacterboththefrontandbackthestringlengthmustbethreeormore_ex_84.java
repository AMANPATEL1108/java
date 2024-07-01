public class lastthreecharactertostringaddthreecharacterboththefrontandbackthestringlengthmustbethreeormore_ex_84 {
    public static void main(String[] args) {
        String str = "Python";

        int slength = 3;

        if (slength > str.length()) {
            slength = str.length();
        }

        String subpart = str.substring(str.length() - 3);

        System.out.println(subpart + str + subpart);

    }
}