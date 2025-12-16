package ArraysQuestions;

import java.util.HashMap;
import java.util.Map;

public class MinimumUnique {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 2, 1, 7};

        Map<Integer, Boolean> map = new HashMap<>();
        int sum = 0;
        for(int val : nums){

            while(map.containsKey(val)){
                val++;
            }

            map.put(val, true);
            sum = sum + val;
        }

        System.out.println(sum);
    }
}
