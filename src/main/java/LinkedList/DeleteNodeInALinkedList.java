package LinkedList;

public class DeleteNodeInALinkedList {

    public static ListNode deleteNode(ListNode head, ListNode node) throws CloneNotSupportedException {
//        ListNode copy = (ListNode) head.clone();
//        ListNode prew = null;
//
//        while (head != null) {
//            prew = head;
//            if (head.val != node.val) head = head.next;
//            else {
//                head = prew;
//                head.next = head.next.next;
//                break;
//            }
//        }
        return head;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ListNode head = new ListNode(
                1, new ListNode(
                2, new ListNode(
                3, new ListNode(
                4, new ListNode(
                5)))));
        ListNode node = new ListNode(3);

        ListNode node1 = deleteNode(head, node);
    }
}
