package StringsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAllAnagrams {
    public static void main(String[] args) {
        String s = "aebcababc";
        String p = "abc";

        findAllAnagrams(p, s);
    }
    private static void findAllAnagrams(String p, String s) {
        List<Integer> list = new ArrayList<>();
        char[] charS = p.toCharArray();
        Arrays.sort(charS);
        for(int i = 0; i <= s.length() - p.length(); i++){
            String sub = s.substring(i , i+ p.length());
            char [] charSub = sub.toCharArray();
            Arrays.sort(charSub);
            if(Arrays.equals(charSub, charS)){
                list.add(i);
            }

        }

        System.out.println("found all anagrams"+" "+list);
    }
}
