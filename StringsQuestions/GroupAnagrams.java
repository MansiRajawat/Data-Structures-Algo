package StringsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        //the approach is to first sort the arrays of string the output after sort -> aet ,aet, ant, aet, ant, abt
       //we need a hashmap it stores the Strings as key and List of string as value

        //we need to check if the key is already present in hashmap, if not add the element in hashmap with
        // an empty arraylist as value and keep adding to the arraylist.
        //we need to create a List<List<String>> and store the map values
        //then we need to iterate over the List<String> to get the result
        HashMap<String, List<String>> map = new HashMap<>();


        for(int i=0; i < arr.length; i++){
            char[] ch = arr[i].toCharArray();

            Arrays.sort(ch);

            String str = new String(ch);

            if(!map.containsKey(str)){
                map.put(str, new ArrayList<>());
            }
                List<String> list = map.get(str);
                list.add(arr[i]);


        }

        List<List<String>> list = new ArrayList<>(map.values());

        for(List<String> val : list){
            System.out.println(val);
        }



    }
}
