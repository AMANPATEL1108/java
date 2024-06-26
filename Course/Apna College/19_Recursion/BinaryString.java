public class BinaryString {
    public static void main(String[] args) {
        binary(3, 0, new StringBuilder(""));
    }

    public static void binary(int n, int lastPlace, StringBuilder str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Recur with the next character being '0'
        binary(n - 1, 0, new StringBuilder(str).append("0"));

        // Recur with the next character being '1' only if lastPlace is 0
        if (lastPlace == 0) {
            binary(n - 1, 1, new StringBuilder(str).append("1"));
        }
    }
}
