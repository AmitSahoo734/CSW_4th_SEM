package CSW_Sem_4.src.ExceptionHandling;

public class Q14_EH {
    public static void main(String[] args) {
        double x=90;
        try{
            double ans=Math.log(Math.abs(Math.cos(x)+Math.sin(x)))/(Math.tan(x)-(1/Math.tan(x)));
            System.out.println("Ans is : "+ans);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
