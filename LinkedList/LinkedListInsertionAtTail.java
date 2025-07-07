package LinkedList;

import java.util.List;

public class LinkedListInsertionAtTail {
    public static void main(String[] args) {
        ListNode head = null;
        int x = 50;
        head = insertTail(head, 30);
        head = insertTail(head, 40);
        head = insertTail(head, x);

        printValue(head);
    }

    private static ListNode insertTail(ListNode head, int val) {
        // ListNode node = new ListNode(val);

        if ( head == null ) {
            ListNode node = new ListNode(val);
            node.next = head; // head is null, so node.next = null
            head = node;
            return node;
        }
        ListNode newNode = new ListNode(val);
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;

    }


    private static void printValue(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.println(temp.data);

            temp = temp.next;
        }

        System.out.println();
    }
}
