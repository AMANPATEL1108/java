public class TypeCasting {
    public static void main(String[] args) {

        float a = 25.12f;

        int b = (int) a;

        System.out.println(b);

        System.out.println("-------------------------------------");

        float marks = 99.9999f;
        int marks2 = (int) marks;
        System.out.println(marks2);

        System.out.println("--------------------------------------------");

        char ch = 'a';
        char ch2 = 'b';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);
    }
}
