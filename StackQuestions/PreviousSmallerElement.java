package StackQuestions;

import java.util.Stack;

public class PreviousSmallerElement {
    public static void main(String[] args) {
        int arr[] = {3,1,0,8,6};
        Stack<Integer> st = new Stack<>();
        int newArr[] = new int[arr.length];
        for(int i=0; i < arr.length; i++){
            int currElement = arr[i];
            if(st.isEmpty()){
                st.push(currElement);
                newArr[i] = -1;
                continue;
            }

            while(!st.isEmpty() && currElement <= st.peek()){
                st.pop();
            }

            if(st.isEmpty()){
                newArr[i] = -1;
            } else {
                newArr[i] = st.peek();
            }
            st.push(currElement);
        }

        for(int i : newArr){
            System.out.println(i);
        }
    }
}
