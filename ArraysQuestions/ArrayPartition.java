package ArraysQuestions;

import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int nums [] = {6,2,6,5,1,2};

        //we need to find the sum for each of the minimum pair
        //meaning - {1,2} -> minimum is 1  -> this is one pair
        //{2,5} -> minimum is 2 -> second pair
        //{6,6} -> minimum is 6 -> third pair

        //the total sum is 1+2+6 -> 9 we need to return


        int result = arrayPartition(nums);
        System.out.println("result of array partition --> "+ result);
    }


    private static int arrayPartition(int[] nums) {

        //first we need to sort the array to if we sort and pick every 2 elements as a pair,
        // the smaller of the two will always be the first one (e.g., [1,2] → min=1).

        Arrays.sort(nums);
        int sum =0;
        //Loop through the array as i+2  because we are forming pairs.

        for(int i=0; i < nums.length; i+=2){
            sum = sum + nums[i];
            //we can also write sum = sum + Math.min(nums[i] , nums[i+1]
            //this will get the minimum of ith index and i +1 index
        }

        return sum;
    }

}
