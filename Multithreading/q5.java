package CSW_Sem_4.src.Multithreading;
import java.util.concurrent.locks.ReentrantLock;

class MainResource {
    int counter = 0;
    ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            // Critical section
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to " + counter);
        } finally {
            lock.unlock(); // Ensure the lock is released
        }
    }

    public int getCounter() {
        return counter;
    }
}

class IncrementTask implements Runnable {
    MainResource resource;

    IncrementTask(MainResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.increment();
            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class q5 {
    public static void main(String[] args) {
        MainResource resource = new MainResource();

        Thread thread1 = new Thread(new IncrementTask(resource), "Thread-1");
        Thread thread2 = new Thread(new IncrementTask(resource), "Thread-2");
        Thread thread3 = new Thread(new IncrementTask(resource), "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final counter value: " + resource.getCounter());
    }
}
