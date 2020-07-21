package LinkedList;

public class MyLinkedList {
    /**
     * Initialize your data structure here.
     */
    public int val;
    public MyLinkedList next;

    public MyLinkedList() {
    }

    public MyLinkedList(int val, MyLinkedList next) {
        this.val = val;
        this.next = next;
    }

    public MyLinkedList(int val) {
        this.val = val;
        this.next = null;
    }

    public MyLinkedList(MyLinkedList list) {
        this.val = list.val;
        this.next = list.next;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        int currentIndex = 0;
        MyLinkedList temp = this;
        while (currentIndex++ < index) {
            temp = temp.next;
        }
        if (temp == null) {
            return -1;
        }
        return temp.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        MyLinkedList curr = this;
        MyLinkedList node = new MyLinkedList(curr);
        curr.val = val;
        curr.next = node;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        MyLinkedList temp = this;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new MyLinkedList(val);
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index == 0) addAtHead(val);
        MyLinkedList current = this;
        MyLinkedList node = new MyLinkedList(val);
        int currentIndex = 0;
        while (currentIndex++ < index - 1) {
            current = current.next;
        }
        if (current == null) return;
        node.next = current.next;
        current.next = node;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        MyLinkedList current = this;
        if (index == 0) {
            current = current.next;
            return;
        }
        int prevIndex = 0;
        while (prevIndex++ < index - 1) {
            current = current.next;
        }
        if (current == null || current.next == null) return;
        current.next = current.next.next;
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
}

class Text {
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList(1, new MyLinkedList(2, new MyLinkedList(3)));
        //int param_1 = obj.get(3);
        //obj.addAtHead(213);
        //obj.addAtTail(213);
        //obj.addAtIndex(4, 234);

        obj.deleteAtIndex(0);
    }
}
