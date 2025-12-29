package StringsQuestions;

public class isSubSequence {
    public static void main(String[] args) {
        //Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
        //A subsequence of a string is a new string that is formed from the original string
        // by deleting some (can be none) of the characters without disturbing the
        // relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

        String s = "abc" ; String t = "ahbgdc";
        //Approach

        /*
        1. we will declare two variable i , j
        2. check each character of the string s and j in the loop
        3. if both the character matches then increment the i val
        4. if not matches then increment the j val
        5. return the i == length of the s , if it's true or false;
        */
        boolean result = isSubSequenceValPresent(s,t);
        System.out.println(result);

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
