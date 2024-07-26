package Inheritance;

class A {
    int a = 10;

    void display() {
        System.out.println("A");
    }
}

class B extends A {
    int b = 20;

    void show() {
        System.out.println("B");
    }
}

class C extends A {
    int c = 10;

    void dis() {
        System.out.println("C");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        B objb = new B();
        objb.show();
        objb.display();
        C objc = new C();
        objc.dis();
        objc.display();
    }
}
