package SuperKeyword;

/**
 * SuperKey
 */

class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }

    int a = 40;

    void display() {
        System.out.println("this is a parent class ");
    }
}

class Child extends Parent {
    // super(); implicitly call by the Jvm
    Child() {
        System.out.println("Child Constructor");
    }

    int a = 30;

    void display() {
        System.out.println("this is a child class ");
        System.out.println(a);
        System.out.println(super.a);
        super.display();
    }
}

public class SuperKey {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }

}