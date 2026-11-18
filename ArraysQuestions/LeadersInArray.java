package ArraysQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
   /* You are given an array arr of positive integers. Your task is to find all the leaders in the array.
      An element is considered a leader if it is greater than or equal to all elements to its right.
      The rightmost element is always a leader. */

        int [] arr = {16, 17, 4, 3, 5, 2};

        List<Integer> leaders = new ArrayList<>();

        int rightMax = arr[arr.length -1];

        leaders.add(rightMax);

        for(int i = arr.length -2; i >=0; i--){
            if(arr[i] >= rightMax){
                rightMax = arr[i];
                leaders.add(rightMax);
            }
        }

        Collections.reverse(leaders);

        System.out.println(leaders);

    }
}
