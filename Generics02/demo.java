package Generics02;
class a{
    public void display(){
        System.out.println(1);
        System.out.println(2);
    }
}
class b extends a {
    public void display(){
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
    }
}
public class demo {
    public static void main(String[] args) {
        a obj1 = new a();
        obj1.display();
        b obj2 = new b();
        obj2.display();
    }
}
