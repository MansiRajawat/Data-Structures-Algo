package LinkedList;

import java.util.HashMap;

public class DetectLoopInLinkedList {
    public static void main(String[] args) {
        ListNode head = null;

        head = insertVal(head, 1);
        head = insertVal(head, 2);
        head = insertVal(head, 3);
        head = insertVal(head, 4);

        //need to assign the last node of LL to point to val 2

        ListNode temp = head;
        ListNode loopNode = null;

        while (temp != null) {
            if ( temp.data == 2 ) {
                loopNode = temp;
            }
            if ( temp.next == null ) {
                temp.next = loopNode;
                break;
            }
            temp = temp.next;
        }

        //detect a loop in LL

        System.out.println(isLoopDetected(head));

    }

    private static boolean isLoopDetected(ListNode head) {

        ListNode temp = head;

        HashMap<ListNode, Integer> map = new HashMap<>();

        while (temp != null) {

            if ( map.containsKey(temp) ) {
                return true;
            }
            map.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }

    private static ListNode insertVal(ListNode head, int data) {

        ListNode node = new ListNode(data);

        if ( head == null ) return node;

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;

        return head;
    }


}
