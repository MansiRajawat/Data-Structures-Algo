package ArraysQuestions.BinarySearch;

public class JumpGame_1 {
    public static void main(String[] args) {
        //Given an array of integers nums, each element in the array represents the maximum jump length at that position.
        // Initially starting at the first index of the array, determine if it is possible to reach the last index.
        // Return true if the last index can be reached, otherwise return false.
        int arr[] = {3,2,1,0,4};

        boolean canJump = canJump_1(arr);
        System.out.println(canJump);
    }

    private static boolean canJump_1(int[] arr) {
        int maxJump =0;
        for(int i =0; i < arr.length; i++){
            if(i > maxJump) return false;
            else {
                int jump = i + arr[i];
                maxJump = Math.max(maxJump, jump);
            }
        }
        return true;
    }
}
