package StringsQuestions;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";

        int result = lengthOfLongestSubstring(s);
        System.out.println("longest substring : "+ result);
    }

    private static int lengthOfLongestSubstring(String s) {


        //first we need to calculate the substrings
        //we can declare a hashmap, if the character of the string is present in map, we put break;
        //if we don't have duplicate , we try to store it in map and calculate the length

        int maxLength =0;

        for(int i=0; i < s.length(); i++){
            HashMap<Character, Boolean> map = new HashMap<>();
            for(int j=i; j < s.length(); j++){

                if(map.containsKey(s.charAt(j))){
                    break;
                } else {
                    map.put(s.charAt(j) , true);
                    maxLength = Math.max(maxLength, j-i+1);
                }
            }
        }
        return maxLength;

    }
}
