public class Swapingab {

    public static void main(String[] args) {

        // Scanner sc=new Scanner(System.in);

        // System.out.println("enter a a:");
        // int a=sc.nextInt();
        // System.out.println("Enter a b:");
        // int b=sc.nextInt();

        int a = 5;
        int b = 10;

        System.out.println("before swaping");
        System.out.println("A is " + a);
        System.out.println("b is " + b);

        System.out.println("After Swaping");

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a is :" + a);
        System.out.println("b is :" + b);
    }
}