public class Leaapyearornot {

    public static boolean yyear(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        if (year % 4 == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int year = 1996;
        if (yyear(year) == true) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }

}
