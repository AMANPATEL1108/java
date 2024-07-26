package Overloading.ConsstructorOverloading;

class A {
    A() {
        System.out.println("Constructor without arguments");

    }

    A(int a) {
        System.out.println("Constructor with arguments");
    }
}

class COverload {
    public static void main(String[] args) {
        A obj = new A();
        A obj1 = new A(10);
    }
}
