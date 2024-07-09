public class MatrixAddition {

    public static void main(String[] args) 
    {
        int [][] matrixA = {{1,2,3}, {4,5,6} , {7,8,9}};
        int [][] matrixB = {{1,2,3}, {4,5,6} , {7,8,9}};
        int [][] result = new int [matrixA.length][matrixB.length];
        
            for (int i=0; i<matrixA.length; i++)
        {
                for (int j=0;j<matrixB.length;j++)
                {
                result[i][j]=matrixA[i][j] + matrixB[i][j];
                }
            
            }
            System.out.println("Matrix addition");
                for (int i=0; i<matrixA.length; i++)
                {
                for (int j=0;j<matrixB.length;j++)
            
                {
                System.out.print(result[i][j] + " ");
                }
                System.out.println();

    }

}
    }
