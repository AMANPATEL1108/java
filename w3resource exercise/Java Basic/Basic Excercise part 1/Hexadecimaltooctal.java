public class Hexadecimaltooctal {

    public static void main(String[] args) {
        // Example usage
        String hexadecimal = "40"; // Hexadecimal number
        String octal = hexToOctal(hexadecimal);
        System.out.println("Hexadecimal: " + hexadecimal + " -> Binary: " + octal);
    }

    public static String hexToOctal(String hexadecimal) {
        // Convert hexadecimal to decimal first
        int decimal = Integer.parseInt(hexadecimal, 16);

        // Convert decimal to binary
        String octal = Integer.toOctalString(decimal);

        return octal;
    }
}
