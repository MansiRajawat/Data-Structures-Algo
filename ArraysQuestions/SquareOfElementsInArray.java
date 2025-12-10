package ArraysQuestions;

import java.util.Arrays;

public class SquareOfElementsInArray {
    public static void main(String[] args) {
        int [] arr = {-4, -2, 1, 4 };
        int [] newArr = new int[arr.length];
        for(int i =0 ; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
