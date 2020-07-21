package LinkedList;

public class SwapNodesInPairs {

    public ListNode swapPairsReq(ListNode head) {
        if ((head == null) || (head.next == null))
            return head;
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;

            first.next = second.next;
            current.next = second;
            second.next = first;
            current = first;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();

        ListNode head = new ListNode(
                1, new ListNode(
                2, new ListNode(
                3, new ListNode(
                4, null))));

        ListNode node = swapNodesInPairs.swapPairs(head);
    }
}
