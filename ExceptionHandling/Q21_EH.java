package CSW_Sem_4.src.ExceptionHandling;

public class Q21_EH {
    public static int add(int [][] mat){
        int n=mat.length,m=mat[0].length;
        int ans=0;
        try{
            for(int i=0;i<n+1;i++){
                for(int j=0;j<m;j++){
                    ans+=mat[i][j];
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        return ans;
    }
    public static int multiply(int [][] mat){
        int ans=1;
        int n=mat.length,m=mat[0].length;
        try{
            for(int i=0;i<n+1;i++){
                for(int j=0;j<m;j++){
                    ans*=mat[i][j];
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        return ans;
    }
    public static void transpose(int [][] mat){
        int n=mat.length,m=mat[0].length;
        try {
            int [][] arr=new int[3][3];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j]=mat[j][i];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i < n - 1 || j < m - 1)
                        System.out.print(arr[i][j] + " , ");
                    else
                        System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        int [][]mat={{1,2,3},{4,5,6},{7,8,9}};
        int ans=add(mat);
        System.out.println(ans);
        ans=multiply(mat);
        System.out.println(ans);
        transpose(mat);
    }
}
