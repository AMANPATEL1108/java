class Counter {

    private int count = 0;

    private synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

/**
 * Threadsynchronization
 */
public class Threadsynchronization {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment(); // Corrected line
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment(); // Corrected line
            }
        });

        thread1.start();
        ;
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("final count:" + counter.getCount());
    }
}