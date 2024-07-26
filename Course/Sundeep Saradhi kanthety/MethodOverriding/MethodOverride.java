package MethodOverriding;

class Parent {
    void display() {
        System.out.println("This is Parent method");
    }
}

class Child extends Parent { // if not using this superr then print parent class then that class code comment
    void display() {
        super.display();// using super Parent access
        System.out.println("This is child Method");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
