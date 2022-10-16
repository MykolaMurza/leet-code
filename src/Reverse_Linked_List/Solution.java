package Reverse_Linked_List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseList(new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(5)))))));
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        return rec(head);
    }

    private static ListNode rec(ListNode node) {
        if (node.next == null) return node;

        ListNode nextNode = node.next;
        ListNode temp = rec(nextNode);
        nextNode.next = node;
        node.next = null;

        return temp;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
