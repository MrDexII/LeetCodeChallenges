package LinkedList;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        ListNode current = head;
        ListNode odd = dummy;
        ListNode even;

        while (current.val % 2 != 0) {
            odd = current;
            current = current.next;
        }
        if (current.next == null) return dummy.next;
        even = current;

        while (current != null) {
            if (current.val % 2 == 0) {
                odd.next = even;
                current.next = even.next;
                even.next = current;
                odd = even;
                current = current.next;
            } else {
                current = current.next;
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();

        ListNode head = new ListNode(
                1, new ListNode(
                2, new ListNode(
                3, new ListNode(
                4, new ListNode(
                5)))));

        ListNode listNode = oddEvenLinkedList.oddEvenList(head);
    }
}
