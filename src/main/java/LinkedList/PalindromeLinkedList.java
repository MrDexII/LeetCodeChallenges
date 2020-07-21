package LinkedList;

public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = revers(slow);
        fast = head;
        while (slow != null) {
            if (slow.val != fast.val)
                return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public static ListNode revers(ListNode head) {
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
//        ListNode node = new ListNode(
//                1, new ListNode(
//                2, null));
        ListNode node = new ListNode(
                1, new ListNode(
                2, new ListNode(
                3, new ListNode(
                2, new ListNode(
                2, new ListNode(
                1, null))))));

        System.out.println(isPalindrome(node));
    }
}
