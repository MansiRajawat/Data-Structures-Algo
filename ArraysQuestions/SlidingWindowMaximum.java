package ArraysQuestions;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr = {4, 0, -1, 3, 5, 3, 6, 8};
        int k = 3;

        //output - 4,3,5,5,6,8

        List<Integer> result = slidingWindowMaximum1(arr, k);
        List<Integer> resultStep2 = slidingWindowMaximum2(arr, k); //this should be better
        System.out.println(resultStep2);
        System.out.println(result);
        }

    private static List<Integer> slidingWindowMaximum2(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();

        for(int i =0; i < arr.length ; i++){
            for(int j = i; j < arr.length; j++){

                int max = 0;
                if(j - i+1 == k){

                    for(int h = i; h <= j; h++){
                        max = Math.max(max, arr[h]);
                    }
                    list.add(max);
                }
            }
        }
        return list;
    }

    private static List<Integer> slidingWindowMaximum1(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();

        //we need to
        for(int i = 0; i <= arr.length - k; i++){
            int max = arr[i];
            for(int j = i; j < i + k; j ++) // we need to traverse till j < i+k or j<= i+k -1
            {
                   max = Math.max(max, arr[j]) ;
                }

                result.add(max);
            }
        return result;
    }


}
