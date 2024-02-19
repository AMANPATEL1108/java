
/**
 * Method
 */
public class Method {

    // static void error() {
    // System.out.println("hello error");
    // }

    // static void name(String name, int age) {
    // System.out.println(name + " Patel" + " age:" + age);
    // }

    // static int add(int a, int b) {
    // return b + a;
    // }

    // public static void main(String[] args) {
    // error();
    // name("gt", 25);
    // name("aman", 22);
    // name("russhi", 23);

    // // System.out.println("total=" + add(5, 6));
    // int z = add(5, 6);

    // System.out.println("total=" + add(5, 6));
    // }

    // Create a checkAge() method with an integer parameter called age
    // static void checkAge(int age) {

    // // If age is less than 18, print "access denied"
    // if (age < 18) {
    // System.out.println("Access denied");

    // // If age is greater than, or equal to, 18, print "access granted"
    // } else {
    // System.out.println("Access granted");
    // }

    // }
    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        // checkAge(20); // Call the checkAge method and pass along an age of 20
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
