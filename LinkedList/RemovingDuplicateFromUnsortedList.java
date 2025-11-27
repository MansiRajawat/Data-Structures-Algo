package LinkedList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicateFromUnsortedList {
    public static void main(String[] args) {
        //Problem Statement
        //Given the head of an unsorted linked list, remove all duplicate nodes such that each
        // value appears only once in the final list. The relative order of nodes should be preserved.
        //Return the head of the modified linked list.

        // 5 → 1 → 2 → 2 → 1 → 3
        ListNode head = new ListNode(5);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(3);

        head = removeDulplicates(head);

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

    }

    private static ListNode removeDulplicates(ListNode head) {
        ListNode temp = head;
        Set<Integer> set = new HashSet<>();

        ListNode dummyNode = new ListNode(0);
        ListNode tail = dummyNode;

        while(temp != null){

            if(!set.contains(temp.data)){
                set.add(temp.data);
                tail.next = temp;
                tail = tail.next;
            }
            temp = temp.next;
        }

        tail.next = null;

        return dummyNode.next;

    }


}
