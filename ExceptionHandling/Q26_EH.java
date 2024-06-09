package CSW_Sem_4.src.ExceptionHandling;

import java.lang.reflect.Method;

class Student{
  int a;
  int b;
  Student(int a,int b){
      this.a=a;
      this.b=b;
  }
  void display(){
      System.out.println(a+" "+b);
  }
}
public class Q26_EH {
    public static void main(String[] args) {
        try{
            Class.forName("CSW_4th_Sem.Error_Handling.Aditya");
            System.out.println("Class found");
        }
        catch (ClassNotFoundException e){
            //prints the path if Class not Found
            System.out.println(e.getMessage());
        }
        //MethodNotFoundException is not a part for mid-sem as it uses javax (as far as I know)
    }
}
