package ArraysQuestions.TwoDimentionalArrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixZero {
    public static void main(String[] args) {

         int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
       // Output: [1,2,3,6,9,8,7,4,5]

        List<Integer> result = spiralMatrixOrder(matrix);
        System.out.println(result);





    }

    private static List<Integer> spiralMatrixOrder(int[][] matrix) {

        List<Integer> spiralMatrix = new ArrayList<>();

        int srow =0; int erow = matrix.length -1;
        int scolumn = 0; int ecolumn = matrix[0].length -1;

        while(srow <= erow && scolumn <= ecolumn){
            //top
            for(int j = scolumn ; j <= ecolumn; j++){
                spiralMatrix.add(matrix[srow][j]);
            }
            //right
            for(int i= srow+1; i <= erow ; i++){
                spiralMatrix.add(matrix[i][ecolumn]);
            }

            //bottom

            if(srow < erow){
                for(int j = ecolumn -1; j >= scolumn; j--){
                    spiralMatrix.add(matrix[erow][j]);
                }
            }

            //left

            if(scolumn < ecolumn){
                for(int i= erow-1; i > srow ; i--){
                    spiralMatrix.add(matrix[i][scolumn]);
                }
            }

            srow++;
            erow--;
            scolumn++;
            ecolumn--;

        }
        return  spiralMatrix;
    }
}
