package CSW_Sem_4.src.Generics02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car implements Comparable<Car>{
    int modalNo;
    String name;
    int stock;

    public Car(int modalNo, String name, int stock) {
        this.modalNo = modalNo;
        this.name = name;
        this.stock = stock;
    }
    @Override
    public int compareTo(Car c){
        if(this.stock > c.stock)
            return 1;
        else
            return -1;
    }
}
public class q3 {
    public static void main(String[] args) {
        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car(2013 , "creta" , 10));
        allCars.add(new Car(2020 , "MG" , 13));
        allCars.add(new Car(2018 , "Kia" , 20));
        allCars.add(new Car(2017 , "Audi" , 45));
        allCars.add(new Car(2015 , "BMW" , 55));

        Collections.sort(allCars);

        for(Car c : allCars){
            System.out.println(c.modalNo+" - "+c.name+" - "+c.stock);
        }
    }
}
