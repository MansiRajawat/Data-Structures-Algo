package StringsQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sortCharactersBasedOnFrequency {
    public static void main(String[] args) {
        String s= "tree";
        List<Character> newList = sortCharactersBasedOnFrequency(s);

        System.out.println(newList);
    }
    private static List<Character> sortCharactersBasedOnFrequency(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char i : s.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());

        List<Character> newList = new ArrayList<>();
        for(Map.Entry<Character,Integer> entry : list){
            newList.add(entry.getKey());

        }
        return newList;
    }
}
