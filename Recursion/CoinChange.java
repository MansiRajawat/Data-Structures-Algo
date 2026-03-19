package Recursion;

import java.util.Map;

public class CoinChange {
    public static void main(String[] args) {
        /*
        You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

        Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

        You may assume that you have an infinite number of each kind of coin.

        Example 1:

        Input: coins = [1,2,5], amount = 11
        Output: 3
        Explanation: 11 = 5 + 5 + 1
        */

        int [] arr = {1,2,5};
        int target = 11;

        int result = minimumCoins(arr.length -1 , target, arr);
        System.out.println(result);
    }

    private static int minimumCoins(int index, int target, int[] coins) {

        if(index == 0){
            if(target % coins[0] == 0){
                return target / coins[0];
            } else {
                return (int) 1e9;
            }
        }

        int notTake = minimumCoins(index -1 , target, coins);

        int take = Integer.MAX_VALUE;

        if(coins[index] <= target){
            take = 1 + minimumCoins(index, target - coins[index], coins);
        }

        return Math.min(take, notTake);
    }
}
