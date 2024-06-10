package CSW_Sem_4.src.Multithreading;
// Class for addition
class Addition implements Runnable {
    double num1;
    double num2;
    Addition(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    @Override
    public void run() {
        double result = num1 + num2;
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + result);
    }
}
// Class for subtraction
class Subtraction implements Runnable {
    private double num1;
    private double num2;

    public Subtraction(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        double result = num1 - num2;
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + result);
    }
}
// Class for multiplication
class Multiplication implements Runnable {
    private double num1;
    private double num2;

    public Multiplication(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        double result = num1 * num2;
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + result);
    }
}
// Class for division
class Division implements Runnable {
    private double num1;
    private double num2;

    public Division(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
        } else {
            System.out.println("Division: Division by zero is not allowed");
        }
    }
}

// Main class to run the calculator
public class q1 {
    public static void main(String[] args) throws InterruptedException{
        double num1 = 10;
        double num2 = 5;

        Thread addThread = new Thread(new Addition(num1, num2));
        Thread subThread = new Thread(new Subtraction(num1, num2));
        Thread mulThread = new Thread(new Multiplication(num1, num2));
        Thread divThread = new Thread(new Division(num1, num2));

        addThread.start();
        subThread.start();
        mulThread.start();
        divThread.start();

        addThread.join();
        subThread.join();
        mulThread.join();
        divThread.join();
    }
}
