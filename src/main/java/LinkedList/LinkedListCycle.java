package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public static boolean hasCycle1(ListNode head) {
        Set<ListNode> setOfNodes = new HashSet<>();
        while (head != null) {
            if (!setOfNodes.contains(head))
                setOfNodes.add(head);
            else
                return true;
            head = head.next;
        }
        return false;
    }

    public static boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4, null))));
        ListNode node1 = node.next;
        node.next.next.next.next = node1;

//        ListNode node = new ListNode(1, new ListNode(2, null));
//        ListNode node1 = node;
//        node.next.next = node1;

        //ListNode node = new ListNode(1);


        System.out.println(hasCycle2(node));
    }

}
