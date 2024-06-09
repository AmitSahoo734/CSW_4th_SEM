package CSW_Sem_4.src.ExceptionHandling;
class A{
    int a;
    A(int a){
        this.a=a;
    }
}
class B extends A{
    int b;
    B(int a,int b){
        super(a);
        this.b=b;
    }
}
public class Q27_EH {
    public static void main(String[] args) {
        try{
            A a=new A(1);
            B b=(B)a;
        }
        catch (ClassCastException e){
            System.out.println(e.getMessage());
        }
    }
}
