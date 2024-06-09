package CSW_Sem_4.src.Generic01;
class Animal {
    String name;
    String color;
    String type;

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public int hashCode() {
        // Generating a unique hash code for the object
        return this.name.hashCode();
    }
}
public class q6 {
    public static void main(String[] args) {
        Animal a1 = new Animal("Dog" , "Brown" , "pet");
        Animal a2 = new Animal("Tiger" , "Yellow" , "wild");
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
    }
}
