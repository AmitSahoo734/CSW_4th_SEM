package CSW_Sem_4.src.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Q24_EH {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("CSW2.txt");
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
