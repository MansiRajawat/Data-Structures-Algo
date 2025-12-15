package StackQuestions;

import java.util.Stack;

public class MiniSwapNeedForStringBalanced {
    public static void main(String[] args) {
        String s =  "][][";

        int result = minimumSwap(s);
        System.out.println(result);
    }

    private static int minimumSwap(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == '['){
                st.push(s.charAt(i));
            } else {
                if(!st.isEmpty()){
                    st.pop();
                }
            }
        }

        int unMatched = st.size();

        return  (unMatched +1)/2;
    }
}
