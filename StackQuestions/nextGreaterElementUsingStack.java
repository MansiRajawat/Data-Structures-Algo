package StackQuestions;

import java.util.Stack;

public class nextGreaterElementUsingStack {
    public static void main(String[] args) {
        int [] arr = {1, 3, 2, 4};
        nextGreaterElementUsingStack(arr);
    }
    private static void nextGreaterElementUsingStack(int[] arr) {
        int [] newArr = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i=arr.length -1; i >=0; i--){
            //get the current element
            int currElement = arr[i];

            //if the stack is empty, we are going to store the current element in the stack and the new arr will store as -1.
            if(st.isEmpty()){
                st.push(currElement);
                newArr[i] = -1;
                continue;
            }
            while( !st.isEmpty() &&  currElement >= st.peek()){
                st.pop();
            }



            if(st.isEmpty()){
                newArr[i] = -1;
            } else {
                newArr[i]  = st.peek();
            }

            st.push(currElement);


        }

        for(int i : newArr){
            System.out.println(i);
        }
    }
}
