package StringsQuestions;

public class CountMatchingSubSequence {
    public static void main(String[] args) {
        //leetcode problem 792. Number of Matching Subsequences
        //Given a string s and an array of strings words, return the number of words[i] that is a subsequence of s.
        //A subsequence of a string is a new string generated from the original string with some
        // characters (can be none) deleted without changing the relative order of the remaining characters.
        //For example, "ace" is a subsequence of "abcde".

        String s = "abcde";
        String [] words = {"a","bb","acd","ace"};
        // There are three strings in words that are a subsequence of s: "a", "acd", "ace".

        /*
        Approach
        1. the problem is similar to find if it is subsequence or not
        2. we still require that logic
        3. here we will iterate the array and check if we have the subsequence with the array string and the stirng s
        4. if we have it is as true after verifying then increment the count
        5. we need to return the count
         */

        int result =  numMatchingSubseq(s,words);
        System.out.println(result);


    }

    private static int numMatchingSubseq(String s, String[] words) {
        int count =0;
        for(String word : words){
            if(isSubSequenceValPresent(word , s)){
                count++;
            }
        }
        return count;
    }

    private static boolean isSubSequenceValPresent(String s, String t) {
        int i=0,j=0;

        while(i < s.length() && j < t.length()){

            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }

        return  i == s.length();
    }
}
