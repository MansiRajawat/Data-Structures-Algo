package ArraysQuestions.TwoDimentionalArrays;

import java.util.*;

public class MinimumDifferentPairs {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10};
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        //get the min diff
        for(int i=0; i < arr.length; i++){
            for(int j = i+1; j <arr.length; j++ ){
                int diff = arr[j] - arr[i];

                if(minDiff > diff){
                    minDiff = diff;
                }
            }
        }

        //compare the min diff with the actual arr element diff

        for(int i=0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++ ){
                int diff = arr[j] - arr[i];

                if(minDiff == diff){
                    List<Integer> val = new ArrayList<>();
                    val.add(arr[i]);
                    val.add(arr[j]);
                    list.add(val);
                }

            }
        }
        System.out.println(list);
    }
}
