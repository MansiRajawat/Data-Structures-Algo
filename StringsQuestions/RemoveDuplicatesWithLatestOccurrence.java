package StringsQuestions;

import java.util.*;

public class RemoveDuplicatesWithLatestOccurrence {
    public static void main(String[] args) {
        String[] str = {"A", "B", "A", "C", "B", "D"};

        List<String> result = new ArrayList<>();

        Set<String> set = new HashSet<>();

        for(int i= str.length -1; i >=0 ; i --){
            if(set.add(str[i])){
              result.add(str[i]);
            }
        }

        Collections.reverse(result);
        System.out.println(result);
    }
}
