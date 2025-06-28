package ArraysQuestions;

public class FirstMissingPositive {
    public static void main(String[] args) {
        /* Leetcode Hard */
        //Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
        //You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
        int[] nums = {3, 4, -1, 1};
        //output -> 2

        // Intuition:
        // 1. We need to rearrange the array so that each number x (where 1 <= x <= n)
        //    is placed at index x - 1. To do this, we use a while loop:
        //    → If the current number is greater than 0 and less than or equal to the array length,
        //    → And the number is not already at its correct position (i.e., nums[nums[i] - 1] != nums[i]),
        //    → Then we swap nums[i] with nums[nums[i] - 1].
        // 2. After the rearrangement, we iterate through the array again.
        //    → If at any index i, the value is not equal to i + 1,
        //    → That means i + 1 is the first missing positive number, so we return it.
        //
        // 3. If all positions from 1 to n are correctly filled (i.e., no mismatch found),
        //    → Then the smallest missing positive is n + 1.


        System.out.println(firstMissingPositive(nums));

    }

    private static int firstMissingPositive(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;

            }
        }

        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] != i + 1 ) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }


}
