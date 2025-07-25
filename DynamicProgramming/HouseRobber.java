package DynamicProgramming;

public class HouseRobber {
    public static void main(String[] args) {
        //You are a professional robber planning to rob houses along a street.
        // Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of
        // them is that adjacent houses have security systems connected and it will automatically contact
        // the police if two adjacent houses were broken into on the same night.
        //Given an integer array nums representing the amount of money of each house,
        // return the maximum amount of money you can rob tonight without alerting the police.


       int[] nums = {2,7,9,3,1};

       //as there are two different possibilities -> take the current one and skip the current one ,
        //same for the next element as well.

        int result = rob(nums);
        System.out.println(result);
    }

    private static int rob(int[] nums) {

        int rob = 0, notRob =0;

        for(int val : nums){
            int newRob = notRob + val ;

            notRob = Math.max(notRob , rob);

            rob = newRob;
        }

        return Math.max(rob, notRob);
    }
}
