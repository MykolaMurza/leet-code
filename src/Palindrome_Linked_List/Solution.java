package Palindrome_Linked_List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(
                new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1, null))))
        ));

        System.out.println(isPalindrome(
                new ListNode(1, new ListNode(2, null))
        ));
    }

    public static boolean isPalindrome(ListNode head) {
        StringBuilder val = new StringBuilder();
        while (head != null) {
            val.append(head.val);
            head = head.next;
        }

        String res = val.toString();

        return res.equals(val.reverse().toString());
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
    }
}

