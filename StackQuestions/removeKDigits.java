package StackQuestions;

import java.util.Stack;

public class removeKDigits {
    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        removeKDigits(num, k);
    }
    private static void removeKDigits(String num, int k) {

        Stack<Character> st = new Stack<>();

        for(char ch : num.toCharArray()){

            while( !st.isEmpty() && k >0 && st.peek() > ch){
                st.pop();
                k--;
            }

            if(ch != '0'){
                st.push(ch);
            }
        }
//the below case is it handle when we have elemnets like 12345 , stack will store all the elements in that case k is not at all 0.
        while(k > 0 && !st.isEmpty()){
            st.pop();
            k--;
        }
//if the number length and the k value is same then we should return 0.
        if( k  == num.length()){
            System.out.println("0");
        } else {
            System.out.println( "values   "+st.toString());
        }
    }
}
