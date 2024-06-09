package CSW_Sem_4.src.ExceptionHandling;
//Question same as Question no. 18
public class Q20_EH {
    public static void arrTraveralRec(int [] arr,int idx,int n){
        if(idx==n+1)
            return;
        try{
            if(idx<n-1)
                System.out.print(arr[idx]+" , ");
            else
                System.out.println(arr[idx]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        arrTraveralRec(arr,idx+1,n);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int idx=0;
        int n=arr.length;
        arrTraveralRec(arr,idx,n);
    }
}
