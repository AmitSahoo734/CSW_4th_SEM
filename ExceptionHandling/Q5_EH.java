package CSW_Sem_4.src.ExceptionHandling;

public class Q5_EH {
    public static void main(String[] args) {
        try {
            double a=Math.log(12.5);
            double b=Math.cos(3.3);
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
