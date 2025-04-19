package StringsQuestions;

import java.util.HashMap;

public class findFirstUniqueCharacterIndex {
    public static void main(String[] args) {
        String uniqueCharacterIndex = "loveleetcode";

        int index = findFirstUniqueCharacterIndex(uniqueCharacterIndex);
        System.out.println("first unique character index  "+ index);
    }
    private static int findFirstUniqueCharacterIndex(String uniqueCharacterIndex) {

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i < uniqueCharacterIndex.length(); i++){
            char ch = uniqueCharacterIndex.charAt(i);

            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }

        for(int i=0; i < uniqueCharacterIndex.length(); i++){
            if(hm.get(uniqueCharacterIndex.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
