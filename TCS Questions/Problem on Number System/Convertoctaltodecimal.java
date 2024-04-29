public class Convertoctaltodecimal {
    public static int Octaltodecimal(int Octal) {
        int Decimal = 0;
        int i = 0;
        while (Octal != 0) {
            int rem = Octal % 10;
            Decimal += rem * Math.pow(8, i);
            i++;
            Octal /= 10;
        }
        return Decimal;

    }

    public static void main(String[] args) {
        int Octal = 345;
        System.out.println("The decimal equation of the given octal number is" + Octaltodecimal(Octal));
    }
}
