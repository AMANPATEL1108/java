public class Exceptionhandling {
    public static void main(String[] args) {

        try {
            int result = divide(10, 0);
            System.out.println("REsult:" + result);
        } catch (ArithmeticException e) {
            System.out.println("an arithmetic occurred :" + e.getMessage());
        } finally {
            System.out.println("finally block execute");
        }

        System.out.println("program continue");
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("divide by 0 is not allowed");

        }
        return dividend / divisor;
    }

}
