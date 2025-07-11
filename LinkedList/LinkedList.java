package LinkedList;

import java.util.Stack;

public class LinkedList {
    ListNode head;

    void append(int data){
        ListNode node = new ListNode(data);

        if(head == null){
            head = node;

            return;
        }

        ListNode temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
    }

    void reverseLinkedList(){
        Stack<ListNode> st = new Stack<>();

        ListNode temp = head;

        while (temp != null){
            st.push(temp);
            temp = temp.next;
        }

        if(!st.isEmpty()){
            head = st.pop();
            temp = head;
        }

        while (!st.isEmpty()){
            temp.next = st.pop();
            temp = temp.next;
        }

        temp.next = null;
    }

    void printValue(){
        ListNode temp = head;

        while(temp != null){
            System.out.println(temp.data);

            temp = temp.next;

        }

        System.out.println();
    }

    boolean isPalindrome(){
        Stack<Integer> stack = new Stack<>();

        ListNode temp = head;

        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }


        temp = head;


        while( temp != null){
            if(temp.data != stack.pop()){
                return false;
            }

            temp = temp.next;

        }

        return true;
    }
}
