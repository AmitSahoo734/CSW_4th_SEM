package CSW_Sem_4.src.ExceptionHandling;

class CustomNullPointerException extends NullPointerException{
    CustomNullPointerException(String s){
        super(s);
    }
}
public class Q3_EH {
    public static void main(String[] args) {
        String s=null;
        try{
            if(s==null) {
                throw new CustomNullPointerException("String is Null");
            }
        }
        catch (CustomNullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
