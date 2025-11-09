package StringsQuestions;

import java.util.HashMap;

public class SecondLargestString {
    public static void main(String[] args) {
        String sentence = "I am a good programmer";

        String[] words = sentence.split("\\s+");


        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word, word.length());
        }

        int maxLength = 0;

        int secondMaxLength = 0;
        String maxWord = "";
        for(String key : map.keySet()){
            int length = map.get(key);

            if(length > maxLength){
                maxLength = length;
            }
        }

        for(String key : map.keySet()){
            int length = map.get(key);
            if(length > secondMaxLength && length != maxLength){
                secondMaxLength = length;
                maxWord = key;
            }
        }

        System.out.println(maxWord);

    }
}
