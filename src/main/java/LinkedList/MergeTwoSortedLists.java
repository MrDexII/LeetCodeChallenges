package LinkedList;

public class MergeTwoSortedLists {


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode tail = dummyNode;
        while (true) {
            if (l1 == null) {
                tail.next = l2;
                break;
            }
            if (l2 == null) {
                tail.next = l1;
                break;
            }
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        return dummyNode.next;
    }

    public static ListNode mergeTwoListsRecursive(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode output = null;
        if (l1.val <= l2.val) {
            output = l1;
            l1.next = mergeTwoListsRecursive(l1.next, l2);
        } else {
            output = l2;
            l2.next = mergeTwoListsRecursive(l1, l2.next);
        }
        return output;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(
                1, new ListNode(
                2, new ListNode(
                4)));

        ListNode l2 = new ListNode(
                1, new ListNode(
                3, new ListNode(
                4)));

        ListNode node = mergeTwoListsRecursive(l1, l2);
    }
}
