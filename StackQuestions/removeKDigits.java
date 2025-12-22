package StackQuestions;

import java.util.Stack;

public class removeKDigits {
    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        System.out.println(removeKDigit(num, k));
    }
    public static String removeKDigit(String num, int k) {
        //the idea of using stack is to maintain the track of digits in monotnic order
        //first use the for loop and using while loop check below conditions
        //1. if the stack is not empty && k >0 && stack top element is greater than the character
        //then remove the element from stack and reduce the k value
        //2. else push the element in stack.
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : num.toCharArray()){

            while(!st.isEmpty() && k >0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }

        for(char c: st){
            sb.append(c);
        }
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.isEmpty() ? "0" : sb.toString();

    }
}
