package Inheritance;

/**
 * MultilevelInheritance
 */

class A {
    int a = 10;

    void display() {
        System.out.println("This is GrandFather");
    }
}

class B extends A {
    int b = 20;

    void show() {
        System.out.println("This is Parent");
    }
}

class C extends B {
    int c = 30;

    void dis() {
        System.out.println("This is Child");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {
        C obj = new C();
        System.out.println(obj.a);
        obj.dis();
        System.out.println(obj.a);
        obj.show();
        System.out.println(obj.b);
        obj.display();
        System.out.println(obj.c);

    }

}