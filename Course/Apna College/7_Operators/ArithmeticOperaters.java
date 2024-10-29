/**
 * index
 */
public class ArithmeticOperaters {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // binary Operaters//

        System.out.println("additio:" + (a + b));
        System.out.println("sub:" + (a - b));
        System.out.println("multiplicaation" + (a * b));
        System.out.println("division:" + (a / b));
        System.out.println("modulo" + (a % b));

        System.out.println("-----------------------------");

        // unary Operaters
        

        // increment
        int d = a++;// after print +1 d=10+1
        int e = b++;// after print +1 e=5+1
        int c = ++a;// before print +1 c= 1+11
        int f = ++b;// before print +1 f=1+6

        System.out.println(d);
        System.out.println(e);
        System.out.println(c);
        System.out.println(f);

        System.out.println("-----------------------------");

        // decrement

        int h = a--;// after print -1 h=12-1
        int i = b--;// after print -1 i=7-1
        int g = --a;// before print -1 g=-1+11
        int j = --b;// before print 1 j=-1+6

        System.out.println(h);
        System.out.println(i);
        System.out.println(g);
        System.out.println(j);

        System.out.println("-----------------------------");

    }
}