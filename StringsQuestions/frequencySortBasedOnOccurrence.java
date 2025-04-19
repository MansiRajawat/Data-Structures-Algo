package StringsQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class frequencySortBasedOnOccurrence {
    public static void main(String[] args) {
        String s = "tree";

        frequencySortBasedOnOccurrence(s);
    }
    public static void frequencySortBasedOnOccurrence(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char i : s.toCharArray()){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        System.out.println("list after sort"+ " "+list);
        List<Character> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : list){
            result.add(entry.getKey());
            // sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        //  System.out.println(" output of the builder "+ " "+ sb);

        System.out.println(result);
    }
}
