package ArraysQuestions;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        //using two pointer approach

        int [] arr = {2,7,11,15};
        int target = 9;

        int [] twoPointerRes = twoSumUsingTwoPointer(arr, target);
        System.out.println(Arrays.toString(twoPointerRes));

        
    }

    private static int[] twoSumUsingTwoPointer(int[] arr, int target) {
        int low =0;
        int high = arr.length -1;
        Arrays.sort(arr);
        while(low < high){
            int currentSum = arr[low] + arr[high];

            if(currentSum == target){
                return new int[]{low, high};
            } else if(currentSum < target){
                low++;
            } else {
                high--;
            }
        }
        return new int[]{};
    }
}
