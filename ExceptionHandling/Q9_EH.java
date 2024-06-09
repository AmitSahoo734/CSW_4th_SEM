package CSW_Sem_4.src.ExceptionHandling;

import java.util.Scanner;

public class Q9_EH {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num : ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd num : ");
        int b=sc.nextInt();
        try{
            int c=a/b;
            System.out.println("division of a/b is : "+c);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
