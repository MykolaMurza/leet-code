package Merge_k_Sorted_Lists;

public class Solution {
    public static void main(String[] args) {
        System.out.println(mergeKLists(new ListNode[0]));
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        // 1. Divide lists into pairs (i * 2, i * 2 + 1);
        // 2. Merge each pair one-by-one --> return a single list;
        // 3. Save new lists into new array
        // 4. Merge new pairs till only one array left in
        while (lists.length > 1) {
            // len=1 -> 1; len=3 -> 2; ceil rounding
            ListNode[] merged = new ListNode[(lists.length + 1) / 2];

            for (int i = 0, j = 0; i < lists.length; i += 2, j++) {
                ListNode left = lists[i];
                ListNode right = i + 1 < lists.length ? lists[i + 1] : null;
                ListNode merge = merge(left, right);
                merged[j] = merge;
            }
            lists = merged;
        }

        return lists[0];
    }

    private static ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(-1), head = dummy;

        while (left != null && right != null) {
            if (left.val <= right.val) {
                head.next = left;
                left = left.next;
            } else {
                head.next = right;
                right = right.next;
            }
            head = head.next;
        }

        if (left != null) {
            head.next = left;
        } else if (right != null) {
            head.next = right;
        }

        return dummy.next;
    }

    private static class ListNode {
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
    }
}
