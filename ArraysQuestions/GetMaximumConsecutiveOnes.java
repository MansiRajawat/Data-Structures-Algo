package ArraysQuestions;

public class GetMaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        getMaximumConsecutiveOnes(nums);
    }
    private static void getMaximumConsecutiveOnes(int[] nums) {
        int count =0;
        int tempCount =0;

        for(int i=0; i < nums.length; i++){
            if(nums[i] == 1) {
                tempCount++;
            } else if(nums[i] == 0){
                tempCount =0;
            }

            count = Math.max(count, tempCount);
        }

        System.out.println(count);
    }
}
