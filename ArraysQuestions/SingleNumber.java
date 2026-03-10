package ArraysQuestions;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,1,1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> val : map.entrySet()){
            if(val.getValue() == 1){
                return val.getKey();
            }
        }

        return 0;
    }
}
