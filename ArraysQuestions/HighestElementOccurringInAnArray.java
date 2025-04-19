package ArraysQuestions;

import java.util.HashMap;
import java.util.Map;

public class HighestElementOccurringInAnArray {
    public static void main(String[] args) {
        int[] higestOccurringElement = {1,1,2,2,3,3,3,4};
        highestElementOccurringInAnArray(higestOccurringElement);
    }
    private static void highestElementOccurringInAnArray(int[] higestOccurringElement) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : higestOccurringElement){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        int maxFrequency = 0;
        int highestElement =0;

//        for(int i : map.keySet()){
//            int frequency = map.get(i)
//        }

        for(Map.Entry<Integer, Integer> i : map.entrySet()){
            int frequency = map.get(i.getKey());

            if(frequency > maxFrequency){
                maxFrequency = frequency;
                highestElement = i.getKey();
            }
        }

        System.out.println("highest element"+ " "+highestElement);
    }
}
