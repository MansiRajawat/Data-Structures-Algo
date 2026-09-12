package ArraysQuestions;

public class MaximumSumCircularSubArray {
    public static void main(String[] args) {
        /* Given an array, find the maximum possible sum of a non-empty subarray,
        where the array is considered circular.
        For example:
        nums = [5, -3, 5] result = 10
         */

        int[] nums = {1,-2,3,-2};


        System.out.println(maximumSumCircularSubArray(nums));

        //approach 2
        /*
        * calculate the maximum subarray
        * calculate the total subarray and the minimum subarray
        * then to get the circular sum we need to subtract the total - the minimum subarray
        * get the max value we need to calculate the max between ( max subarray , circular sum)
        *
        * */

       int result =  maximumSumCircularSubArray2(nums);
        System.out.println(result);
    }

    private static int maximumSumCircularSubArray2(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for(int i =0; i < nums.length; i++){
            int currentSum = 0;
            for(int j = i; j < nums.length; j++){
                currentSum = currentSum + nums[j];
                maxSum = Math.max(maxSum , currentSum);
            }
        }

        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length ; i++){
            int currentSum =0;
            for(int j = i; j < nums.length; j++){
                currentSum = currentSum + nums[j];
                minSum = Math.min(minSum, currentSum);
            }
        }

        //total array sum

        int totalSum =0;

        for(int i=0; i < nums.length; i++){
            totalSum = totalSum + nums[i];
        }


        int circularSum = totalSum - minSum;

        return Math.max(maxSum , circularSum);
    }

    private static int maximumSumCircularSubArray(int[] nums) {

        int sum = Integer.MIN_VALUE;

        for(int i=0; i < nums.length; i++){
            int currentSum = 0;

            for(int j = 0; j < nums.length; j++){
                int index = (i+j) % nums.length;

                currentSum = currentSum + nums[index];

                sum = Math.max(currentSum, sum);
            }
        }
        return sum;
    }
}
