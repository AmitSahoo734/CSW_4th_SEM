package CSW_Sem_4.src.Generic01;

import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car> {
    String model;
    String color;
    double speed;
    public Car(String model, String color, double speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "model: "+model+" color: "+color+" speed: "+speed;
    }

    //helps the "Collections.sort" to compare before swapping elements -
    // this: current object
    // c1: other objects to compare
    @Override
    public int compareTo(Car c1) {
        if(this.speed > c1.speed)
            return 1;
        else
            return -1;
    }
}

public class q5 {
    public static <car> void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("sport-56" , "Red" , 202.5));
        cars.add(new Car("sport-57" , "Pink" , 199.45));
        cars.add(new Car("sport-79" , "Blue" , 239.05));
        cars.add(new Car("sport-47" , "Green" , 276.7));
        cars.add(new Car("sport-09" , "Black" , 292.94));

        Collections.sort(cars);
        for(Car c : cars){
            System.out.println(c.model+" "+c.speed+" "+c.color);
        }
    }
}
