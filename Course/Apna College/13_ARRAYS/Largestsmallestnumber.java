public class Largestsmallestnumber {
    public static void main(String[] args) {
        int number[] = { 12, 15, 26, 65, 3, 63, 52, 85 };
        System.out.println("larget Value=" + getlargest(number));
    }

    public static int getlargest(int number[]) {
        int largest = Integer.MIN_VALUE;// -infinity
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("smallest Value is " + smallest);
        return largest;
    }
}
 