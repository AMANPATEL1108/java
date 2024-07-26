package AbstractMethods;

abstract class A {
    abstract void display();

    // void show() {
    // System.out.println("Show Method");
    // }

}

abstract class B extends A {
    void display() {
        System.out.println("Abstract Methods in A");
    }

    abstract void show();
}

class C extends B {
    void show() {
        System.out.println("show method in c");
    }
}

public class Abstract {
    public static void main(String[] args) {
        // B obj = new B();
        C obj = new C();
        obj.display();
        obj.show();

    }

}