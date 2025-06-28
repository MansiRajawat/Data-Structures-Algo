package GreedyAlgorithm;

public class JumpGame1 {
    public static void main(String[] args) {
        //Given an array of integers nums, each element in the array represents the maximum jump length at that position.
        // Initially starting at the first index of the array, determine if it is possible to reach the last index.
        // Return true if the last index can be reached, otherwise return false.

        int[] nums = {2, 3, 1, 1, 4};

        //the logic is to calculate the maximum jump that too completing the entire traversal of the loop

        //if the array contains 0, that means we cannot reach till the end of the array, as the max jump won't be updating when it
        //reaches the 0th element index

        //if we reach to the last index of the array , return true else false

        boolean isLastIndexReached = canJump(nums);

        System.out.println(isLastIndexReached);

    }
    public static boolean canJump(int[] nums) {
        int maxJump=0;
        for(int i=0; i < nums.length; i++){

            if(i > maxJump) return false;
            else {
                int jump = i + nums[i];
                maxJump = Math.max(maxJump, jump);
            }
        }

        return true;
    }
}
