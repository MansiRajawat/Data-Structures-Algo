package ArraysQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappeared {
    public static void main(String[] args) {
        /* Given an array nums of n integers where nums[i] is in the range [1, n]
        , return an array of all the integers in the range [1, n] that do not appear in nums.
         */

        int[] nums=  {4,3,2,7,8,2,3,1};

        List<Integer> result = findDisappearedNumbers(nums);
        System.out.println(result);
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        List<Integer> list = new ArrayList<>();

        for(int i=1; i <= nums.length; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
