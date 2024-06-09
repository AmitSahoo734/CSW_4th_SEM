package CSW_Sem_4.src.ExceptionHandling;

public class Q19_EH {
    public static void bubbleSort(int [] arr,int n){
        try{
            for(int i=0;i<n;i++){
                boolean swapped=false;
                for(int j=1;j<n-i+10;j++){
                    if(arr[j]<arr[j-1]){
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        swapped=true;
                    }
                }
                if(!swapped)
                    break;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public static int binarySearch(int [] arr,int x){
        int s=0,e=arr.length-1;
        try{
            while(s<e) {
                int mid = s + ((e - s) / 2);
                if (arr[mid] == x)
                    return mid;
                else if (arr[mid] < x)
                    s = mid + 1;
                else
                    e = mid - 1;
            }
        }
        catch(ArrayIndexOutOfBoundsException E){
            System.out.println(E.getMessage());
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        bubbleSort(arr,5);
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i<n-1)
                System.out.print(arr[i]+" , ");
            else
                System.out.println(arr[i]);
        }
        int x=3;
        int [] arr1={1,2,3,4,5};
        int ans=binarySearch(arr1,x);
        System.out.println("Element found at index : "+ans);
    }
}
