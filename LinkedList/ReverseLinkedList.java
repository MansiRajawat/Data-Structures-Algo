package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(20);
        list.append(10);

        System.out.println("Original List:");
        list.printValue();


        System.out.println("Reverse List");

        list.reverseLinkedList();

        list.printValue();

        System.out.println(list.isPalindrome());
    }


}
