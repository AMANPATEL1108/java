package Thred.Method;

class Th extends Thread {
    public void run() {
        Thread t = currentThread();
        System.out.println("Thred Status=" + t.isAlive());
        for (int i = 0; i <= 5; i++) {

            try {
                t.sleep(1000);
            } catch (Exception e) {
            }

            System.out.println(i);
        }
    }
}

public class MethosThred {
    public static void main(String[] args) {
        Th t1 = new Th();
        Th t2 = new Th();
        System.out.println("ID=" + t1.getId());
        System.out.println("Name of Thred" + t1.getName());
        t1.setName("AMAN");
        System.out.println("name of the after Change=" + t1.getName());
        System.out.println("Prority is=" + t1.getPriority());
        t1.setPriority(1);
        System.out.println("Prority is Thre After Change=" + t1.getPriority());

        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
        }
        System.out.println("Thread 1 status =" + t1.isAlive());
        t2.start();

    }
}
