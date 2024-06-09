package CSW_Sem_4.src.OOPs;
interface Vehicle {
   public void accelerate();
   public void brake();
}
class Car2 implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking");
    }

    // Method overloading for accelerate() with different parameters
    public void accelerate(int speed) {
        System.out.println("Car is accelerating at " + speed + " km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating at " + speed + " km/h for " + duration + " seconds");
    }
}
class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is braking");
    }

    // Method overloading for accelerate() with different parameters
    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating at " + speed + " km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating at " + speed + " km/h for " + duration + " seconds");
    }
}

public class Q8 {
    public static void main(String[] args) {
        
        Car2 c = new Car2();
        Bicycle b = new Bicycle();

        
        c.accelerate();
        c.brake();

        b.accelerate();
        b.brake();

        
        c.accelerate(60);
        c.accelerate(80, 10);

    b.accelerate(20);
        b.accelerate(30, 5);
    }
}
