package ArraysQuestions;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        PriorityQueue<Integer> val = new PriorityQueue<>();

        for(int i =0; i < nums.length; i++){
            val.add(nums[i]);
            if(val.size() > k){
               val.poll();
            }
        }

        System.out.println(val.peek());

        //System.out.println(val);
    }
}
