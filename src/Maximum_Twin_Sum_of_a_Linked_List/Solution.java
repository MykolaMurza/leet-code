package Maximum_Twin_Sum_of_a_Linked_List;

class Solution {
    public static void main(String[] args) {
        System.out.println(pairSum(new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5, new ListNode(6)))
        )))));
    }

    public static int pairSum(ListNode head) {
        // We need to find the middle of linked list to divide pairs.
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next;
            if (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        // slow - is the last element of the first half of pairs.
        // slow.next - the first element of pairs.
        ListNode reversed = reverse(slow.next);
        int max = Integer.MIN_VALUE;
        while (reversed != null && head != null) {
            max = Math.max(max, reversed.val + head.val);
            reversed = reversed.next;
            head = head.next;
        }

        return max;
    }

    private static ListNode reverse(ListNode node) {
        if (node.next == null) {
            return node;
        }

        ListNode nextNode = node.next;
        ListNode temp = reverse(nextNode);
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