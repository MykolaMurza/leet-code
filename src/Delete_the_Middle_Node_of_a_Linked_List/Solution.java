package Delete_the_Middle_Node_of_a_Linked_List;

public class Solution {
    public static void main(String[] args) {

    }

    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }

        ListNode slow = head, fast = head, previous = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                previous = slow;
                slow = slow.next;
            } else {
                previous.next = slow.next;
                return head;
            }

            fast = fast.next;
        }

        previous.next = slow.next;
        return head;
    }
}

class ListNode {
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