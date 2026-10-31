package ArraysQuestions.prefixSum;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};

        int[] prefixSum = BuildPrefixSum(nums);

        System.out.println(Arrays.toString(prefixSum));

    }

    private static int[] BuildPrefixSum(int[] nums) {
        int [] result = new int[nums.length];

        result[0] = nums[0];

        for(int i=1; i < nums.length; i++){
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }
}
