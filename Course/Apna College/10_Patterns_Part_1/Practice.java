public class Practice {
    public static void main(String[] args) {

        char ch = 'A';
        for (int i = 1; i <= 4; i++) {
            for (int chars = 1; chars <= i; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

}
