package StringsQuestions;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctSubstring {
    public static void main(String[] args) {
        //we need to count all the distinct substring in a string
        String str = "abcd";

        //a, b, c, d, ab, abc, abcd, bc, bcd, cd

        //we should return the size or the count

        //we need a set interface to store the elements

     // int result = findAllDistinctSubstringsApproach1(str);
       // System.out.println("approach 1 result --> "+result);

       // int resultApproach2 = findAllDistinctSubstringsApproach2(str);
        //System.out.println("approach 2 result --> "+ resultApproach2);

        Set<String> set = new HashSet<>();
        for(int i=0; i < str.length(); i++){

            for (int j =i; j < str.length(); j++){

                StringBuilder sb = new StringBuilder();

                for(int k =i ; k <= j; k++){
                    sb.append(str.charAt(k));
                }

                set.add(sb.toString());

            }
        }

        System.out.println(set.size());

    }

    private static int findAllDistinctSubstringsApproach2(String str) {
        //this approach using the internal substring function
        Set<String> set = new HashSet<>();

        for(int i=0; i < str.length(); i++){
            for(int j = i+1; j <= str.length(); j++){
                set.add(str.substring(i,j));
            }
        }
        return set.size();
    }

    private static int findAllDistinctSubstringsApproach1(String str) {
        //we need to calculate the substring and store in a set
        Set<String> set = new HashSet<>();

        for(int i=0; i < str.length(); i++){
            StringBuilder sb = new StringBuilder();

            for(int j=i; j < str.length(); j++){
                sb.append(str.charAt(j));
                set.add(sb.toString());
            }
        }
       return set.size();
    }



}
