package CSW_Sem_4.src.OOPs;
class Laptop{
    private String model;
    private double price;
    public void Setmodel(String model){
        this.model=model;
    }
    public void Setprice(double price){
        this.price=price;
    }
    @Override
    public String toString(){
            return "Laptop Model: " + model + ", Price: $" + price;

    }
}
public class Q4 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.Setmodel("hp");
        laptop.Setprice(630000);
        System.out.println(laptop.toString());
    }
}

