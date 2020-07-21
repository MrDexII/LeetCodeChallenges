package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleII {
    //O(n) time complexity
    //O(n) space complexity
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null && head.next != null) {
            if (set.add(head))
                head = head.next;
            else
                return head;
        }
        return null;
    }

    public ListNode detectCycle2(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode rabbit = head;
        ListNode turtle = head;
        ListNode inter = null;

        while (rabbit != null && rabbit.next != null) {
            rabbit = rabbit.next.next;
            turtle = turtle.next;

            if (rabbit == turtle) {
                inter = rabbit;
                break;
            }
        }
        if (rabbit == null || inter == null) return null;

        rabbit = head;

        while (rabbit != inter) {
            rabbit = rabbit.next;
            inter = inter.next;
        }

        return rabbit;
    }

    public static void main(String[] args) {
        LinkedListCycleII linkedListCycleII = new LinkedListCycleII();

        ListNode head = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4, new ListNode(48, new ListNode(123, new ListNode(321, new ListNode(12321))))))));
        ListNode pointer = head.next.next.next;
        head.next.next.next.next.next.next.next.next = pointer;


        ListNode node = linkedListCycleII.detectCycle2(head);

    }
}
