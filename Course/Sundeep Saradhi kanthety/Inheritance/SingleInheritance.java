package Inheritance;

class Parent {
    int a = 20;

    void display() {
        System.out.println("This is Parent Class");
    }

}

class Child extends Parent {
    int b = 10;

    void show() {
        System.out.println("This is Child Class");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("Child class variable is =" + c.b);
        c.show();
        System.out.println("Parent Class variable is " + c.a);
        c.display();
    }
}
