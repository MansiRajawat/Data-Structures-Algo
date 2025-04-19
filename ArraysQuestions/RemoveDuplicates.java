package ArraysQuestions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr1 = {1,2,2,3,4,4,4,5};

        removeDuplicates(arr1);
    }
    private static void removeDuplicates(int[] arr1) {
        LinkedHashMap<Integer, Boolean> hs = new LinkedHashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i < arr1.length; i++){
            if(!hs.containsKey(arr1[i])){
                hs.put(arr1[i], true);
                list.add(arr1[i]);
            }
        }

        int [] res = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        for(int i : res){
            System.out.println(i);
        }

    }
}
