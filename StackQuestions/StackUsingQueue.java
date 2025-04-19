package StackQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
//intution is
        //1. first create 2 queue
        //2. then for push , first store the element in second queue and loop till the first queue is not empty then move all the
        //element from first queue to second queue
        //3. then swap the elements present in second queue to first queue

        q2.add(x);

        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1= q2;
        q2 = temp;
    }

    public int pop(){
        if(q1.isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        return q1.remove();
    }

    public int top(){
        if(q1.isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        return q1.peek();
    }
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
      StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top()); //3
        System.out.println("Popped: " + stack.pop());      // 3
        System.out.println("Popped: " + stack.pop());      // 2
        System.out.println("Is empty: " + stack.isEmpty());// false
        System.out.println("Popped: " + stack.pop());      // 1
        System.out.println("Is empty: " + stack.isEmpty()); //true
    }
}
