package StackQuestions;

import java.util.Stack;

public class ValidParanthesis {

    public static void main(String[] args) {
        Stack<Character> validParanthesis = new Stack<>();

        String str = "((({})))";

        System.out.println(isBalancedParanthesis(str));


    }

    private static boolean isBalancedParanthesis(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;

                stack.pop();
            }


        }
        return stack.empty();
    }

}
