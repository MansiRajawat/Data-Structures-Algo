package ArraysQuestions;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] nums = {1,8,6,2,5,4,8,3,7};

         //You are given an integer array height of length n.
        // There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
        //Find two lines that together with the x-axis form a container, such that the container contains the most water.
        //Return the maximum amount of water a container can store.

        //ans - 49

        //if we use two pointer -> we require less width that means to reduce the width and height should be always greater
        //to have more area.



        int left =0, right = nums.length -1;
        int max = Integer.MIN_VALUE;

        while (left < right){
            int area = (right - left) * Math.min(nums[left], nums[right]);
             max = Math.max(max, area);
            if(nums[left] < nums[right]){
                left++;
            } else {
                right --;
            }
        }

        System.out.println(max);
    }
}
