public class Comparearidgtdigit_ex_54 {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;
        int num3 = 15;

        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        int lastDigit3 = num3 % 10;

        boolean result = (lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3) || (lastDigit2 == lastDigit3);

        System.out.println(result);
    }
}
