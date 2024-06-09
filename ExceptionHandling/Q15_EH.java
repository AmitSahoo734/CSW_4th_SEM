package CSW_Sem_4.src.ExceptionHandling;

public class Q15_EH {
    public static void main(String[] args) {
        try{
            String s="ad";
            try{
                int a=10,b=0;
                int c=a/b;
                System.out.println("Ans is : "+c);
            }
            catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
            int x=Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
