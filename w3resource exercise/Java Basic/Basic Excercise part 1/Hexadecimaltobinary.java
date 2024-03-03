public class Hexadecimaltobinary {

    public static void main(String[] args) {
        // Example usage
        String hexadecimal = "1F"; // Hexadecimal number
        String binary = hexToBinary(hexadecimal);
        System.out.println("Hexadecimal: " + hexadecimal + " -> Binary: " + binary);
    }

    public static String hexToBinary(String hexadecimal) {
        // Convert hexadecimal to decimal first
        int decimal = Integer.parseInt(hexadecimal, 16);

        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);

        return binary;
    }
}
