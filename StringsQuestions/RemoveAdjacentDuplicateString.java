package StringsQuestions;

import java.util.Stack;

public class RemoveAdjacentDuplicateString {
    public static void main(String[] args) {
        //Input: s = "abbaca"
        //Output: "ca"

        /*
        You are given a string s consisting of lowercase English letters.
        A duplicate removal consists of choosing two adjacent and equal letters and removing them.
        We repeatedly make duplicate removals on s until we no longer can.
        Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
         */
        String s = "abbaca";

        String result = removeDuplicates(s);
        System.out.println(result);
    }

    private static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i < s.length(); i++){
            if(!st.isEmpty() && st.peek() == s.charAt(i)){
                st.pop();
            } else{
                st.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char c : st){
            sb.append(c);
        }

        return sb.toString();
    }
}
