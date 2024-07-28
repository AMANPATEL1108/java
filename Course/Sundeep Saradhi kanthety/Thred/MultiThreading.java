package Thred;

class Example {
    synchronized static void display() {
        Thread g = Thread.currentThread();

        for (int i = 0; i <= 5; i++) {

            try {
                Thread.sleep(1000);
                System.out.println(g.getName() + " " + i);
            } catch (Exception e) {
            }
        }

    }
}

class T extends Thread {
    // Example e;

    // T(Example e) {
    // this.e = e;
    // }

    public void run() {
        Example.display();

    }
}

public class MultiThreading {
    public static void main(String[] args) {
        // Example T = new Example();
        T t1 = new T();
        T t2 = new T();
        T t3 = new T();
        t1.start();
        t2.start();
        t3.start();

    }
}
