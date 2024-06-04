
public class hexadecimaltodecimal {

    public static void main(String[] args) {
        // Example usage
        String hexadecimal = "1F"; // Hexadecimal number
        int decimal = hexToDecimal(hexadecimal);
        System.out.println("Hexadecimal: " + hexadecimal + " -> Decimal: " + decimal);
    }

    public static int hexToDecimal(String hexadecimal) {
        // Using parseInt with radix 16 to convert hexadecimal to decimal
        return Integer.parseInt(hexadecimal, 16);
    }
}
