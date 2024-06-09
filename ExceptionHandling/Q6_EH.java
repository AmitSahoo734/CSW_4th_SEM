package CSW_Sem_4.src.ExceptionHandling;

public class Q6_EH {
    public static void main(String[] args) {
        String s="ad";
        try {
            int n = Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
