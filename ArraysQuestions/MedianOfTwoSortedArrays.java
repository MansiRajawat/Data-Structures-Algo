package ArraysQuestions;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr3[] = {1,3};
        int arr4[] = {2};

        double resultOfMedian = medianOfTwoSortedArrays(arr3, arr4);
        System.out.println(resultOfMedian);
    }

    private static double medianOfTwoSortedArrays(int[] arr3, int[] arr4) {
        int[] newArr = new int[arr3.length + arr4.length];
        double median = 0;
        for(int i =0; i < arr3.length; i++){
            newArr[i] = arr3[i];
        }

        for(int i=0; i < arr4.length; i++){
            newArr[arr3.length + i] = arr4[i];
        }

        Arrays.sort(newArr);

        if(newArr.length /2 != 0){
            median = newArr[newArr.length /2];
        } else {
            median = (newArr[newArr.length/2 -1] + newArr[newArr.length/2]) /2.0;
        }

        return  median;
    }
}
