package Recursion;

public class UniquePath {
    public static void main(String[] args) {
        /* There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
        The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or
        right at any point in time.
        Given the two integers m and n, return the number of possible unique paths that the robot can take to
        reach the bottom-right corner.
         */

        int m = 3, n =7;


        int result = uniquePath(m-1, n-1);
        System.out.println(result);
    }

    private static int uniquePath(int i, int j) {
        if(i==0 && j ==0)
        {
            return 1;
        }

        if (i < 0 || j < 0) {
            return 0;
        }

        int up = uniquePath(i-1,j);
        int left = uniquePath(i, j-1);

        return up + left;
    }


}
