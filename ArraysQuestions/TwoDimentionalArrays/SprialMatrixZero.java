package ArraysQuestions.TwoDimentionalArrays;

public class SprialMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };


        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        for(int i=0; i < matrix.length; i++){
            for (int j =0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }

            }
        }


        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
                if(row[i] || col[j]){
                    matrix[i][j] =0;
                }
            }
        }


            for (int[] i : matrix) {
                for (int val : i) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }


    }
}
