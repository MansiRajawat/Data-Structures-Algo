package StringsQuestions;

import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";

        boolean result1 = permutationInStringApproach2(s1,s2);
        System.out.println(result1);

        boolean result2 =permutationInStringApproach1(s1, s2);

        System.out.println(result2);
    }

    private static boolean permutationInStringApproach1(String s1, String s2) {
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

            for(int i = 0; i <= s2.length() - s1.length(); i++){
                String sub = s2.substring(i, i + s1.length()); //in substring from and to is there , from is inclusive and to is exclusive
                char[] s2Array = sub.toCharArray();
                Arrays.sort(s2Array);

                String sorted2 = new String(s2Array);

                if(sorted1.equals(sorted2)){
                    return true;
                }
            }

        }
        return false;
    }

    private static boolean permutationInStringApproach2(String s1, String s2) {

        for(int i=0; i < s2.length(); i++){
            for(int j = i; j < s2.length(); j++) {

                if (j - i + 1 > s1.length()) break;

                if (j - i + 1 == s1.length()) {
                    String subString = s2.substring(i, j + 1);

                    if (ContainsString(s1, subString)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean ContainsString(String s1, String s2) {
        int [] arr = new int[256];

        for(char c : s2.toCharArray()){
            arr[c]++;
        }

        for(char c: s1.toCharArray()){
            if(arr[c] == 0){
                return false;
            }
            arr[c]--;
        }

        return true;

    }
}
