package StringsQuestions;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        //Given an array of positive integers nums and a positive integer target,
        // return the minimal length of a subarray whose sum is greater than or equal to target.
        // If there is no such subarray, return 0 instead.

        int target = 7;
        int[] nums = {2,3,1,2,4,3};

        System.out.println(minSubArrayLen(nums, target));

    }

    private static int minSubArrayLen(int[] nums, int target) {
        int result = Integer.MAX_VALUE;

        for(int i=0; i < nums.length; i++){
            for(int j =i; j < nums.length; j++){

                int sum = 0;

                for(int k = i; k <=j; k++){
                    sum = sum + nums[k];
                }

                if(sum >= target){
                    result = Math.min(result, j-i+1);
                }
            }
        }
        return result;
    }


}
