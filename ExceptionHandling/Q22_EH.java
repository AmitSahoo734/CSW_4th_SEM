package CSW_Sem_4.src.ExceptionHandling;
class CustomCheckedException extends Exception{
    CustomCheckedException(String s){
        super(s);
    }
}
public class Q22_EH {
    public static void main(String[] args) {
        int a=12;
        try{
            if (a<18)
                throw new CustomCheckedException("You are below 18");
            else
                System.out.println("your age is : "+a);
        }
        catch (CustomCheckedException e){
            System.out.println(e.getMessage());
        }
    }
}
