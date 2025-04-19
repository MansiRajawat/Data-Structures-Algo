package StackQuestions;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		Stack<Character> validParanthesis = new Stack<>();

		String str = "((({})))";

		// char[] lastOpen = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '(' || str.charAt(i) == '{') {

				validParanthesis.add(str.charAt(i));
			} else {
				if (validParanthesis.isEmpty()) {
					System.out.println("false");
				}
			}

			char peekchar = validParanthesis.peek();

			if ((str.charAt(i) == ')' && peekchar == '(') || (str.charAt(i) == '}' && peekchar == '{')) {
				validParanthesis.pop();
				System.out.println("valid paranthesis");
			} else {
				System.out.println(" no element ");
				break;
			}
		}
		
		

	}

}
