package LinkedList;

public class InsertionAtKthPosition {
    public static void main(String[] args) {
        ListNode head = null;
        head = insertAtKthPosition(head, 30, 1);
        head = insertAtKthPosition(head, 40, 2);
        head = insertAtKthPosition(head, 50,3);
        head = insertAtKthPosition(head, 60,2);

        printVal(head);
        //output -> 30 60 40 50

    }

    private static void printVal(ListNode head) {
        ListNode temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    private static ListNode insertAtKthPosition(ListNode head, int val, int position) {

        if ( head == null ) {
            ListNode node = new ListNode(val);
            node.next = head;
            head = node;
            return head;
        }

        ListNode newNode = new ListNode(val);

        if(position == 1){
            newNode.next = head;
            return newNode;
        }
        ListNode temp = head;
        int count = 1;
        while (temp != null){


            if(count == position -1){
                ListNode x = new ListNode(val);
                x.next = temp.next;
                temp.next = x;
                break;
            }
            temp = temp.next;
            count++;
        }

        return head;
    }


}
