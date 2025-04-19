package StackQuestions;

import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = {-1, -2, -3};
        //the logic to use stack here is , as we move further in for loop , the previous element may have the
        //positive element , it should be compared with the negative element , if it's less , then remove from the stack.
        //we always store the positive elements in the stack.
        //we first iterate the array and declare a stack
        //then store the positive numbers in the stack
        //we will use a while loop to check if the stack's top  is not empty and also less than the arr[i] , arr[i]
        //should be less than 0 and also stack top element should be greater than zero, then only we will remove from the stack
        //also we will compare if the stack's top element is equals to the arr[i] then remove from stack
        //if the arr[i] is small then set the destroyed flag as true to destroy it.


        Stack<Integer> st = new Stack<>();

        for(int i=0; i < asteroids.length; i++){
            boolean destroyed = false;

            while(!st.isEmpty()  && asteroids[i] <0 && st.peek() >0){
                if(st.peek() < Math.abs(asteroids[i])){
                    st.pop();
                   // destroyed = true;
                   // break;
                } else if(st.peek() == Math.abs(asteroids[i])){
                    st.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }

            if(!destroyed){
                st.push(asteroids[i]);
            }
        }

        int newArr[] = new int[st.size()];

        for (int i = newArr.length - 1; i >= 0; i--) {
            newArr[i] = st.pop();
        }

        for (int i : newArr){
            System.out.println(i);
        }

    }
}
