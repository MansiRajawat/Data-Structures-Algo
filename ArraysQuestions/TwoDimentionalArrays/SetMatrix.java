package ArraysQuestions.TwoDimentionalArrays;

import java.util.Arrays;

public class SetMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };

        int [] [] output = setMatrixZero(arr);

        for (int[] row : output) {
            System.out.println(Arrays.toString(row));
        }

    }


    private static int[][] setMatrixZero(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];


        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n ; j++){
                if(arr[i][j] ==0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n ; j++){

                if(row[i] || col[j]){
                      arr[i][j] =0;
                }
            }
        }

        return arr;
    }
}
