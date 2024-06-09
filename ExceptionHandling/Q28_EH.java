package CSW_Sem_4.src.ExceptionHandling;

public class Q28_EH {
    public static void f(){
        f();
    }
    public static void main(String[] args) {
        try{
            f();
        }
        catch (StackOverflowError e){
            System.out.println("StackOverFlow Occurred");
            //prints null if Stack overFlow Occurs
            System.out.println(e.getMessage());
        }
    }
}
