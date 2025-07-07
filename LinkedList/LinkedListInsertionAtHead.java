package LinkedList;

public class LinkedListInsertionAtHead {
    public static void main(String[] args) {
        ListNode head = null;

        head = insertHead(head, 30);
        head = insertHead(head, 40);
        printValuesFromLinkedList(head);
    }


    public static ListNode insertHead(ListNode head, int val) {

        ListNode newNode = new ListNode(val);

        newNode.next = head;

        head = newNode;

        return head;

    }

    public static void printValuesFromLinkedList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.println(temp.data);

            temp = temp.next;
        }

        System.out.println(" ");

    }
}
