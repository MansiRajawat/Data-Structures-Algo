package ArraysQuestions;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr = {4, 0, -1, 3, 5, 3, 6, 8};
        int k = 3;

        //output - 4,3,5,5,6,8

        List<Integer> result = new ArrayList<>();

        //we need to
        for(int i=0; i <= arr.length -k; i++){
            int max =arr[i];
            for(int j = i; j < i +k; j ++) // we need to traverse till j < i+k or j<= i+k -1
            {
                   max = Math.max(max, arr[j]) ;
                }

                result.add(max);
            }
        System.out.println(result);
        }


}
