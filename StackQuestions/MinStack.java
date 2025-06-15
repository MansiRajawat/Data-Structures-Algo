package StackQuestions;

import java.util.Stack;

public class MinStack {

    public static void main(String[] args) {
        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

       MinStack st = new MinStack();

       st.push(-2, mainStack, minStack);
       st.push(0, mainStack, minStack);
       st.push(-3, mainStack, minStack);
        st.getMin(minStack);
        st.pop(mainStack, minStack);
        st.top(mainStack);
        st.getMin( minStack);

    }

    private void push(int val, Stack mainStack, Stack minStack){

       mainStack.push(val);
      if(minStack.isEmpty()){
          minStack.push(val);
      } else {
          int currentElement = Math.min(val, (Integer) minStack.peek());

          minStack.push(currentElement);
      }

        System.out.println("push main---> "+mainStack);
        System.out.println("push min ---> "+minStack);
    }

    private int  getMin(Stack minStack){
        System.out.println("find min from min stack  "+minStack.peek());
        return (int) minStack.peek();
    }

    private int top(Stack mainStack){
        System.out.println(" top of main stack --> "+mainStack.peek());
        return (int) mainStack.peek();
    }

    private void pop(Stack mainStack, Stack minStack){
        System.out.println("pop main stack "+mainStack.pop());
        System.out.println("pop min stack "+minStack.pop());

    }

}
