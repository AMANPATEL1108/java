package Overloading.OperatorOverloading;

public class OOverloading {

    void add() {
        int a = 10, b = 30;
        System.out.println("a+b=" + (a + b)); // if not braced then they are print like a String and with bracate there
                                              // sum is given
    }

    public static void main(String[] args) {
        OOverloading obj = new OOverloading();
        obj.add();
    }

}
