package ThisKeyword;

public class ThisDemo {
    int a = 10;

    void display() {
        int a = 200;
        System.out.println("Local Variable:" + a);
        System.out.println("Instance variable:" + this.a);
    }

    public static void main(String[] args) {
        ThisDemo obj = new ThisDemo();
        // System.out.println(a);
        obj.display();

    }
}
 