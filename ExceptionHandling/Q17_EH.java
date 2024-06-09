package CSW_Sem_4.src.ExceptionHandling;

import java.util.LinkedList;
import java.util.List;

public class Q17_EH {
    public static void main(String[] args) {
        List<Integer>ll=new LinkedList<>();
        int [] arr={1,2,3,4,5};
        int idx=0;
        try{
            while(true){
                ll.add(arr[idx]);
                if(idx<4)
                    System.out.print(arr[idx]+"->");
                else
                    System.out.println(arr[idx]);
                idx++;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
