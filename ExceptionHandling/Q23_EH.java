package CSW_Sem_4.src.ExceptionHandling;
import java.io.*;
public class Q23_EH {
    public static void main(String[] args) {
        File f=new File("CSW2.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try{
            FileWriter fw=new FileWriter("CSW2.txt",true);
            fw.write("hello Aditya \n");
            fw.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
