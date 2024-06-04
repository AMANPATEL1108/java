public class Arrays {
    public static void main(String[] args) {
        int[] no = { 1, 2, 3, 4, 5, 6 };

        int firstno = no[0];
        int thirdno = no[2];

        System.out.println("firstno is:" + firstno);

        System.out.println("third no is:" + thirdno);
        

        no[1] = 10;// update no

        System.out.println("updated no 2 is :" + no[1]);

        int length = no.length;

        for (int i = 0; i < length; i++) {
            System.out.println(no[1] + " ");
        }
    }

    public static String toString(int[] result) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }
}
