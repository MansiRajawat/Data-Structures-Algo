package GreedyAlgorithm;

import java.util.Map;

public class JumpGame2 {
    public static void main(String[] args) {
       int[] nums = {2, 3, 1, 1, 4};

       /*
       * You are initially positioned at index 0.
           Each element nums[i] represents the maximum length of a forward jump from index i.
           * In other words, if you are at index i, you can jump to any index (i + j) where: 0 <= j = nums[i] andi + j < n
             Return the minimum number of jumps to reach index n - 1. The test cases are generated such that you can reach index n - 1.
        */

        System.out.println(jump(nums));
    }
//At each jump, don't decide exactly where to land. Instead,
// look at all positions you can reach with the current jump,
// and choose the one that gives you the farthest reach for the next jump.
    private static int jump(int[] nums) {

        int jump=0;
        int currentEnd =0, farthestEnd = 0;

        for(int i=0; i < nums.length -1; i++){
            farthestEnd = Math.max(farthestEnd, i + nums[i]);

            if(i == currentEnd){
                jump++;
                currentEnd = farthestEnd;
            }
        }
        return jump;

    }
}
