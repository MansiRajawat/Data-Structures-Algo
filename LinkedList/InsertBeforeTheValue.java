package LinkedList;


public class InsertBeforeTheValue {
    public static void main(String[] args) {
        ListNode head = null;
        head = insertTail(head, 30);
        head = insertTail(head, 40);
        head = insertTail(head, 50);
        head = insertTail(head, 60);
        head = insertTail(head, 70);
        head = insertTail(head, 80);

        head = insertBeforeTheValue(head, 60, 90);

        printValue(head);

        //output -> 30 40 50 90 60 70 80
    }

    private static ListNode insertTail(ListNode head, int data) {

        if( head == null ){
            ListNode node = new ListNode(data);

            node.next = head;
            head = node;
            return head;
        }

        ListNode newNode = new ListNode(data);
        ListNode temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;

        return head;


    }

    private static ListNode insertBeforeTheValue(ListNode head, int orginalVal , int insertedVal) {

        ListNode temp = head;

        if(head == null){
            return head;
        }

        if(head.data == orginalVal){
            ListNode node = new ListNode(insertedVal);
            node.next = head;
            return  node;
        }

        while (temp.next != null){
            if(temp.next.data == orginalVal){
                ListNode newNode = new ListNode(insertedVal);
                newNode.next = temp.next;
                temp.next = newNode;

                break;
            }

            temp = temp.next;
        }

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
