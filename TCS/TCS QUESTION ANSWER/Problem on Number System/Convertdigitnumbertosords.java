public class Convertdigitnumbertosords {
    public static void convertnymintoword(String str) {
        String[] singledigit = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
                "nine" };
        String[] twodigits = new String[] { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "ninteen", "twelve" };
        String[] tensmultiple = new String[] { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
                "eighty", "ninty" };
        String[] tenspower = new String[] { "humdred", "thousand" };

        if (str.length() == 0) {
            System.out.println(" ");
            return;
        } else if (str.length() == 1) {
            System.out.println(str.charAt(0) - '0');
            return;
        }

        int len = str.length();

        for (int i = 0; i < str.length(); i++) {
            if (len > 2) {
                if (str.charAt(i) - '0' != 0) {
                    System.out.println(singledigit[str.charAt(i) - '0'] + "");
                    System.out.println(tenspower[len - 3] + "");
                }
                len--;

            } else {
                if (str.charAt(i) - '0' == 1) {
                    System.out.println(twodigits[str.charAt(i + 1) - '0'] + "");
                    return;
                } else if (str.charAt(i) - '0' != 0) {
                    System.out.println(tensmultiple[str.charAt(i) - '0'] + "");
                    if (str.charAt(i + 1) - '0' != 0)
                        System.out.println(singledigit[str.charAt(+1) - '0']);
                    return;
                }
            }

        }
    }

    public static void main(String[] args) {
        String str = "9090";
        convertnymintoword(str);
    }

}
