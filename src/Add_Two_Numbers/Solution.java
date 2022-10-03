package Add_Two_Numbers;

public class Solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

        System.out.println(addTwoNumbers(l1, l2));

        ListNode l3 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null)))))));
        ListNode l4 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null))));

        System.out.println(addTwoNumbers(l3, l4));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode tmp = result;

        int p = 0;
        while (l1 != null || l2 != null || p == 1) {
            // Calculate value based on l1, l2 and/or p values.
            if (l1 != null && l2 != null) {
                tmp.val = l1.val + l2.val + p;
            } else if (l1 == null && l2 == null) {
                tmp.val = p;
            } else if (l1 != null) {
                tmp.val = l1.val + p;
            } else tmp.val = l2.val + p;
            // Drop 'p' value after arithmetics.
            p = 0;
            // If value more than 9 - save 1 to the next step.
            if (tmp.val > 9) {
                tmp.val %= 10;
                p = 1;
            }
            // Update l1 and l2 to their next step.
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            // Add new ListNode as next, if l1 or l2 exists.
            if (l1 != null || l2 != null || p == 1) {
                tmp.next = new ListNode();
                tmp = tmp.next;
            } else tmp.next = null;
        }

        return result;
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
