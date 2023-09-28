public class Bitwiseoperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        int notx = ~a;

        System.out.println("and:" + and);
        System.out.println("or:" + or);
        System.out.println("xor:" + xor);
        System.out.println("notx:" + notx);
    }
}
