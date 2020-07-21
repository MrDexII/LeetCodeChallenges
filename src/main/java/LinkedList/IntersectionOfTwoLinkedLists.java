package LinkedList;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        while (pointerA != pointerB) {
            pointerA = pointerA.next;
            pointerB = pointerB.next;
            if (pointerA == pointerB) return pointerA;
            if (pointerA == null) pointerA = headB;
            if (pointerB == null) pointerB = headA;
        }
        return null;
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        Set<ListNode> set = new HashSet<>();
        ListNode pointerA = headA, pointerB = headB;

        while (pointerA != null) {
            set.add(pointerA);
            pointerA = pointerA.next;
        }

        while (pointerB != null) {
            if (set.contains(pointerB)) return pointerB;
            pointerB = pointerB.next;
        }
        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        ListNode temp3 = headA;
        ListNode temp4 = headB;
        Stack<ListNode> stack1 = new Stack<ListNode>();
        Stack<ListNode> stack2 = new Stack<ListNode>();
        ListNode result = null;
        while (temp1 != null) {
            stack1.add(temp1);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            stack2.add(temp2);
            temp2 = temp2.next;
        }
        while (!(stack1.isEmpty()) && !(stack2.isEmpty())) {
            temp3 = stack1.pop();
            temp4 = stack2.pop();

            if (temp3 == temp4) {
                result = temp3;
            } else {
                break;
            }
        }
        return result;
    }

    public ListNode getIntersectionNode3(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while(nodeA != null && nodeB != null){
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        int aCount = 0;
        int bCount = 0;
        while(nodeA != null || nodeB != null){
            if(nodeA != null){
                nodeA = nodeA.next;
                aCount++;
            }
            if(nodeB != null){
                nodeB = nodeB.next;
                bCount++;
            }
        }

        nodeA = headA;
        nodeB = headB;
        while(aCount != 0 || bCount != 0){
            if(aCount != 0){
                nodeA = nodeA.next;
                aCount--;
            }
            if(bCount != 0){
                nodeB = nodeB.next;
                bCount--;
            }
        }

        while(nodeA != nodeB){
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return nodeA;
    }

    public static void main(String[] args) {
        IntersectionOfTwoLinkedLists intersection = new IntersectionOfTwoLinkedLists();

        ListNode headA = new ListNode(4, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5, null)))));
        ListNode pointer = headA.next.next;
        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1, pointer)));

//        ListNode headA = new ListNode(1, new ListNode(9, new ListNode(1, new ListNode(2, new ListNode(4, null)))));
//        ListNode pointer = headA.next.next.next;
//        ListNode headB = new ListNode(3, pointer);

//        ListNode headA = new ListNode(2, new ListNode(2, new ListNode(4, new ListNode(5, new ListNode(4, null)))));
//        ListNode pointer = headA.next.next;
//        ListNode headB = new ListNode(2, new ListNode(2, pointer));

//        ListNode headA = new ListNode(2, new ListNode(6, new ListNode(4, null)));
//        ListNode headB = new ListNode(1, new ListNode(5, null));

        ListNode intersectionNode = intersection.getIntersectionNode3(headA, headB);

    }
}
