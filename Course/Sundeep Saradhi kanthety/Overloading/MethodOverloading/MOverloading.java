package Overloading.MethodOverloading;

class A {
    void add() {
        int a = 10, b = 20;
        int c = a + b;
        System.out.println("Sum=" + c);

    }

    void add(int x, int y) {
        int z = x + y;
        System.out.println("Sum is =" + z);
    }
}

class MOverloading {
    public static void main(String[] args) {
        A obj = new A();
        obj.add();
        obj.add(40, 50);
    }
}
