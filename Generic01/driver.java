package CSW_Sem_4.src.Generic01;

class Car1 implements Comparable<Car1> {
    private String model;
    private String color;
    private double speed;

    public Car1(String model, String color, double speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    public String getModel() {
        return model;
    }

    //helps the "Collections.sort" to compare before swapping elements -
    // this: current object
    // c1: other objects to compare
    @Override
    public int compareTo(Car1 obj) {
        if (this.speed < obj.speed) {       //this - c1     &     obj - c2
            return -1;
        } else if (this.speed > obj.speed) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class driver {
    public static void main(String[] args) {
        Car1 c1 = new Car1("2023" , "black" , 207.56);
        Car1 c2 = new Car1("2024" , "Blue" , 239.56);

        int Result = c1.compareTo(c2);
        if (Result < 0) {
        System.out.println(c2.getModel() + " model is faster than " + c1.getModel());
        System.out.println("Details of Faster Car: " + c2);
        } else if (Result > 0) {
        System.out.println(c1.getModel() + " is faster than " + c2.getModel());
        System.out.println("Details of Faster Car: " + c1);
        } else {
        System.out.println("Both cars have the same speed.");
        }
    }
}
