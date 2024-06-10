package CSW_Sem_4.src.Multithreading;

class NumberPrinter {
    int number = 1;
    int MAX = 20;
    public synchronized void printOdd() {
        if (number < MAX) {
            if (number % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Odd: " + number);
            number++;
            notify();
        }
    }
    public synchronized void printEven() {
        if(number < MAX) {
            if (number % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Even: " + number);
            number++;
            notify();
        }
    }
}

public class q4 {
    public static void main(String[] args) throws InterruptedException{
        NumberPrinter printer = new NumberPrinter();

        Thread oddThread = new Thread(printer::printOdd);
        Thread evenThread = new Thread(printer::printEven);

        oddThread.start();
        evenThread.start();

        oddThread.join();
        evenThread.join();
    }
}
