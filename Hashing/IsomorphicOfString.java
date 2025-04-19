package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicOfString {
    public static void main(String[] args) {
       String s1 = "add";
       String s2 = "egg";
        boolean result = isIsomorphic(s1, s2);
        if (result) {
            System.out.println("The strings are isomorphic.");
        } else {
            System.out.println("The strings are not isomorphic.");
        }


    }

    public static boolean isIsomorphic(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Character> value = new HashMap<>();
        Set<Character> mappedValues = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            char s1Char = s1.charAt(i);
            char s2Char = s2.charAt(i);

            if (!value.containsKey(s1Char)) {
                if (mappedValues.contains(s2Char)) {
                    return false;
                }
                value.put(s1Char, s2Char);
                mappedValues.add(s2Char);
            } else if (value.get(s1Char) != s2Char) {
                return false;
            }
        }

        return true;
    }
}
