package StringsQuestions;

import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";

        if(s1.length() > s2.length()) {
            System.out.println("false");
        } else {
            char[] s1Array = s1.toCharArray();
            Arrays.sort(s1Array);
           String sorted1 = new String(s1Array);
            //my logic is to compare the second string with first string
            //sort the first string and store it in a new string s11
            // for that I need to substract the length of second string from first string
            //after that I need to find all the substrings from s2 from index till index + s1.length
            //sort the substring and store it in a new string  s22vand check if the s11 equals with s2 if yes return true else false

            for(int i=0; i < s2.length() - s1.length(); i++){
                String sub = s2.substring(i, i + s1.length()); //in substring from and to is there , from is inclusive and to is exclusive
                char[] s2Array = sub.toCharArray();
                Arrays.sort(s2Array);

                String sorted2 = new String(s2Array);

                if(sorted1.equals(sorted2)){
                    System.out.println("true");
                    break;
                }
            }

        }
    }
}
