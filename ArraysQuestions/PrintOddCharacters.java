package ArraysQuestions;

import java.util.HashSet;
import java.util.Set;

public class PrintOddCharacters {
    public static void main(String[] args) {
        String s = "aabbabb";

        Set<Character> st = new HashSet<>();

        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(st.contains(ch)){
                st.remove(ch);

            } else {
                st.add(ch);
            }
        }

        System.out.println(st);
    }



}
