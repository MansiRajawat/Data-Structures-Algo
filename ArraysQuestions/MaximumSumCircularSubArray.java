package ArraysQuestions;

public class MaximumSumCircularSubArray {
    public static void main(String[] args) {
        /* Given an array, find the maximum possible sum of a non-empty subarray,
        where the array is considered circular.
        For example:
        nums = [5, -3, 5] result = 10
         */

        int[] nums = {5,-3,5};

        System.out.println(maximumSumCircularSubArray(nums));

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
