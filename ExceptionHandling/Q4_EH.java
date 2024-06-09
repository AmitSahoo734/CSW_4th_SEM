package CSW_Sem_4.src.ExceptionHandling;

import java.io.*;
class FileReadPermissionException extends IOException{
    FileReadPermissionException(String s){
        super(s);
    }
}
public class Q4_EH {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("CSW2.txt");
            try{
                if(!fr.ready()){
                    throw new FileReadPermissionException("File Cannot be read");
                }
            }
            catch(FileReadPermissionException e){
                System.out.println(e.getMessage());
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
