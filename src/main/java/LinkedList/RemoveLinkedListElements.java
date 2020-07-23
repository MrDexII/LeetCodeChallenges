package LinkedList;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1, head);
        ListNode node = dummy;
        while (node.next != null) {
            if (node.next.val == val)
                node.next = node.next.next;
            else
                node = node.next;
        }
        return dummy.next;
    }

    public ListNode removeElementsRec(ListNode head, int val) {
        if (head == null) return head;
        head.next = removeElementsRec(head.next, val);
        return (head.val == val) ? head.next : head;
    }

    public ListNode removeElementsRec2(ListNode head, int val) {
        if (head == null) return head;
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) return head;

        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
                curr = curr.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();

        //1->2->6->3->4->5->6
        ListNode head = new ListNode(
                6, new ListNode(
                2, new ListNode(
                6, new ListNode(
                3, new ListNode(
                4, new ListNode(
                5, new ListNode(
                6)))))));

//        ListNode head = new ListNode(
//                1, new ListNode(
//                2, new ListNode(
//                2, new ListNode(
//                1))));
        //ListNode head = new ListNode(1, new ListNode(1));

        // ListNode head = new ListNode();

        ListNode listNode = removeLinkedListElements.removeElementsRec(head, 6);
    }
}
