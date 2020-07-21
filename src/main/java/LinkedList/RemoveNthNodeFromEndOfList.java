package LinkedList;

public class RemoveNthNodeFromEndOfList {

    private static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pointer = dummy;
        ListNode nPointer = dummy;
        for (int i = 1; i <= n+1 ; i++)
            pointer = pointer.next;
        while (pointer != null) {
            nPointer = nPointer.next;
            pointer = pointer.next;
        }
        nPointer.next = nPointer.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
//        ListNode head = new ListNode(
//                1, new ListNode(
//                2, new ListNode(
//                3, new ListNode(
//                4, new ListNode(
//                5)))));
        int n = 1;
        ListNode head = new ListNode(
                1, new ListNode(
                2));
        //ListNode head = new ListNode(1);

        ListNode node = removeNthFromEnd(head, n);
    }


}
