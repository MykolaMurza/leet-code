package Design_Linked_List;

public class Solution {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
    }
}

class MyLinkedList {
    private Node head;
    private int length;

    public MyLinkedList() {

    }

    public int get(int index) {
        if (head == null || index > length) {
            return -1;
        }

        Node pointer = head;
        for (int i = 0; i < index; i++) {
            if (pointer == null) {
                return -1;
            }
            pointer = pointer.next;
        }

        return pointer != null ? pointer.val : -1;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }

        Node pointer = head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }

        pointer.next = new Node(val);
        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
            return;
        }

        Node pointer = head;
        for (int i = 1; i < index; i++) {

            if (pointer == null) {
                return;
            }
            pointer = pointer.next;
        }

        if (pointer == null) {
            return;
        }

        Node newNode = new Node(val);
        if (pointer.next != null) {
            newNode.next = pointer.next;
        }
        pointer.next = newNode;
        length++;
    }

    public void deleteAtIndex(int index) {
        if (head == null || index > length) {
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node pointer = head;
        for (int i = 1; i < index; i++) {
            pointer = pointer.next;
        }

        if (pointer.next != null && pointer.next.next != null) {
            pointer.next = pointer.next.next;
        } else {
            pointer.next = null;
        }
        length--;
    }

    private static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}