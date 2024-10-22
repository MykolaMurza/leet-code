package Design_Circular_Queue;

public class Solution {
    public static void main(String[] args) {
        MyCircularQueue queue = new MyCircularQueue(5);
    }
}

class MyCircularQueue {
    private Node head;
    private Node tail;
    private int totalLength;
    private int size;

    public MyCircularQueue(int k) {
        totalLength = k;
    }

    public boolean enQueue(int value) {
        if (isFull())
            return false;

        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;

        return true;
    }

    public boolean deQueue() {
        if (isEmpty())
            return false;

        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;

        return true;
    }

    public int Front() {
        if (isEmpty())
            return -1;
        return head.val;
    }

    public int Rear() {
        if (isEmpty())
            return -1;
        return tail.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == totalLength;
    }
}

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */