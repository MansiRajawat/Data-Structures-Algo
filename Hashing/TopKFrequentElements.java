package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};

        int k =2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int value : arr) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        int[] newArr = new int[k];



        for(int i =0; i < k; i++){
            int freqKey = 0;
            int freqVal = Integer.MIN_VALUE;

            for(Map.Entry<Integer, Integer> j : map.entrySet()){

                if(j.getValue() > freqVal){
                    freqVal = j.getValue();
                    freqKey = j.getKey();
                }
            }

            newArr[i] = freqKey;
            map.remove(freqKey);
        }

        System.out.println(Arrays.toString(newArr));

    }
}
