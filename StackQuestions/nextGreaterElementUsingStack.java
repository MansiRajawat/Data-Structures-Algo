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

            //if the top of the stack is greater than the element in array , it is the next greatest element

//            if(st.peek() > currElement){
//                st.push(currElement);
//                newArr[i] = st.peek();
//                continue;
//            }

            //if the element in array is greater than the element in stack, or stack element is less than the array element
            //we need to pop the element from stack

            while(st.peek() <= currElement && !st.isEmpty()){
                st.pop();
            }

            //if the stack is empty , add -1 in the new arr, else pick the top element of the stack

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
