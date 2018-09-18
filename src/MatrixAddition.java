import java.util.*;

class MatrixAddition{
    public String addition(int[][] firstMatrix,int[][] secondMatrix,int row,int column)
    {   int[][] finalMatrix=new int[row][column];
        for(int i=0;i<row;i++)
            for (int j = 0; j < column; j++)
            finalMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
        String object=Arrays.deepToString(finalMatrix);
        return object;
    }
}