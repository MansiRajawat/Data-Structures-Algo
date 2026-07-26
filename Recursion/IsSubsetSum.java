package Recursion;

public class IsSubsetSum {
    public static void main(String[] args) {
        /* Given an array arr of n integers and an integer target,
           determine if there is a subset of the given array with a sum equal to the given target.
        */

        int[] arr = {1,2,7,3};
        int target = 6;

        boolean result = isSubsetSum(arr, 0, target);
        System.out.println(result);
    }

    private static boolean isSubsetSum(int[] arr, int index, int target) {
        if(target == 0){
            return true;
        }
        if(index == arr.length){
            return false;
        }

        boolean pick = false;

        if(arr[index] <= target){
            pick = isSubsetSum(arr, index +1, target - arr[index]);
        }

        boolean notPick = isSubsetSum(arr, index+1, target);

        return pick || notPick;
    }
}
