package ArraysQuestions.BinarySearch;

public class findInsertPostion {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = 4;
        int result = findInsertPostion(nums, target);
        System.out.println(result);
    }

    private static int findInsertPostion(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        int ans = nums.length;
        while( low <= high){
            int mid = (low + high)/2;

            if(nums[mid] >= target){
                ans = mid;

                high = mid -1;

            }
            else {
                low = mid +1;
            }
        }

        return ans;
    }

}


