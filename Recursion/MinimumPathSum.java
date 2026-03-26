package Recursion;

public class MinimumPathSum {
    public static void main(String[] args) {
        /*
        Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.
        Note: You can only move either down or right at any point in time.
         */

        int[][] arr = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        int row = arr.length;
        int col = arr[0].length;

        int result = minPathSum(row -1, col -1, arr);
        System.out.println(result);
    }

    private static int minPathSum(int i, int j, int[][] arr) {

        if(i==0 && j ==0){
            return arr[0][0];
        }
        if (i < 0 || j < 0) {
            return (int) 1e9;
        }
        int up = arr[i][j] + minPathSum(i-1, j , arr);
        int left = arr[i][j] + minPathSum(i, j-1, arr);

        return Math.min(up,left);
    }
}
