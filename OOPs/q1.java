package CSW_Sem_4.src.OOPs;
class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
class CarTester {
    public void tester() {
        Car myCar1 = new Car("Toyota", "Corolla");
        Car myCar2 = new Car(null, null);
        System.out.println("Initial make and model of myCar1: " + myCar1.getMake() + ", " + myCar1.getModel());
        System.out.println("Initial make and model of myCar2: " + myCar2.getMake() + " , " + myCar2.getModel());


        myCar2.setMake("Ford");
        myCar2.setModel("Mustang");


        System.out.println("Updated make and model of myCar2: " + myCar2.getMake() + " " + myCar2.getModel());
    }
}
public class q1{
    public static void main(String[]args){
        CarTester c1 = new CarTester();
        c1.tester();
    }
}

