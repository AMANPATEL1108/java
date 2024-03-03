public class octaltohexadecimal {

    public static void main(String[] args) {
        // Example usage
        String octal = "75"; // Octal number
        String hexadecimal = octalToHex(octal);
        System.out.println("Octal: " + octal + " -> Hexadecimal: " + hexadecimal);
    }

    public static String octalToHex(String octal) {
        // First, convert octal to decimal
        int decimal = Integer.parseInt(octal, 8);

        // Then, convert decimal to hexadecimal
        String hexadecimal = Integer.toHexString(decimal);

        return hexadecimal.toUpperCase(); // Convert to uppercase for standard hex representation
    }
}
