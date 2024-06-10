package CSW_Sem_4.src.Multithreading;

class MatrixMultiplier implements Runnable {
    private int[][] result;
    private int[][] mat1;
    private int[][] mat2;
    private int row;

    public MatrixMultiplier(int[][] result, int[][] mat1, int[][] mat2, int row) {
        this.result = result;
        this.mat1 = mat1;
        this.mat2 = mat2;
        this.row = row;
    }

    @Override
    public void run() {
        int colsMat2 = mat2[0].length;
        int colsMat1 = mat1[0].length;

        for (int j = 0; j < colsMat2; j++) {
            result[row][j] = 0;
            for (int k = 0; k < colsMat1; k++) {
                result[row][j] += mat1[row][k] * mat2[k][j];
            }
        }
    }
}

public class q3 {
    public static void main(String[] args) throws InterruptedException{
        int[][] mat1 = {{1, 17, 84},{0, 5, 0},{0, 0, 8}};
        int[][] mat2 = {{1, 0, 0},{0, 1, 0},{0, 0, 1}};

        int rowsMat1 = mat1.length;
        int colsMat2 = mat2[0].length;

        int[][] result = new int[rowsMat1][colsMat2];

        Thread[] threads = new Thread[rowsMat1];
        for (int i = 0; i < rowsMat1; i++) {
            threads[i] = new Thread(new MatrixMultiplier(result, mat1, mat2, i));
            threads[i].start();
        }

        for (int i = 0; i < rowsMat1; i++) {
            threads[i].join();
        }
        // Print the result matrix
        System.out.println("Result matrix:");
        for (int i = 0; i < rowsMat1; i++) {
            for (int j = 0; j < colsMat2; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
