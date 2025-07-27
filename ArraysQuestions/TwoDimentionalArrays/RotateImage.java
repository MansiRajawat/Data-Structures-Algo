package ArraysQuestions.TwoDimentionalArrays;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        //You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
        //You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
        // DO NOT allocate another 2D matrix and do the rotation.
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //1. we need to get the transpose of the matrix and then reverse the matrix

        //calculate the transpose of the matrix
        for(int i=0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //calculate the reverse of the matrix using two pointer

        for(int i=0; i < arr.length; i++){
            int left =0; int right = arr.length -1;

            while(left < right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;

                left++;
                right--;
            }
        }

        for(int [] row : arr){
            System.out.println(Arrays.toString(row));
        }
    }
}
