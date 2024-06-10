package CSW_Sem_4.src.Multithreading;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

class PrimeGenerator implements Runnable {
    int start;
    int end;
    List<Integer> primeNumbers;
    ReentrantLock lock = new ReentrantLock();
    public PrimeGenerator(int start, int end, List<Integer> primeNumbers) {
        this.start = start;
        this.end = end;
        this.primeNumbers = primeNumbers;
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                lock.lock();
                    primeNumbers.add(i);
                    lock.unlock();
            }
        }
    }
}
//Prime numbers up to 50: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47]
public class q6 {
    public static void main(String[] args) throws InterruptedException{
        int limit = 50;
        int numberOfThreads = 4;
        List<Integer> primeNumbers = new ArrayList<>();

        int range = limit / numberOfThreads;    //range of numbers to calculated by each Thread

        Thread[] threads = new Thread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * range + 1;
            int end = (i == numberOfThreads - 1) ? limit : (i + 1) * range;
            threads[i] = new Thread(new PrimeGenerator(start, end, primeNumbers));
            threads[i].start();
        }
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i].join();
        }

        System.out.println("Prime numbers up to " + limit + ": " + primeNumbers);
    }
}

