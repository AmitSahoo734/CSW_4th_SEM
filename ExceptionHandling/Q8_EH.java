package CSW_Sem_4.src.ExceptionHandling;

import java.util.Scanner;

public class Q8_EH {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a num : ");
            double n=sc.nextDouble();
            double x=Math.sqrt(n);
            System.out.println("Sq root is : "+x);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
