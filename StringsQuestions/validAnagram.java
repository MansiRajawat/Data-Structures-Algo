package StringsQuestions;

import java.util.HashMap;

public class validAnagram {
    public static void main(String[] args) {
        String s1= "anagram";
        String s2= "nagaram";
        boolean isValidAnagram=  validAnagram(s1,s2);
        System.out.println("valid anagram ..."+ isValidAnagram + " ");
    }
    private static boolean validAnagram(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }

        //create a hashmap of Character , Integer and store the values from the first string
        //after iterating the second string , check , if we donot have the character already present in the map
        // then return false as it will donot form an anagram
        //if the key is present for two times then remove from the second iteration

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1) ;
        }

        for(int i=0; i < s2.length(); i++){
            char ch =s2.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }
            if(map.get(ch) ==1){
                map.remove(ch);
            } else{
                map.put(ch, map.getOrDefault(ch,0)-1);
            }
        }
        return true;
    }
}
