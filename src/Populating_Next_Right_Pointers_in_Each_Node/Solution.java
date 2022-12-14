package Populating_Next_Right_Pointers_in_Each_Node;

public class Solution {
    public static void main(String[] args) {

    }

    public static Node connect(Node root) {
        if (root == null || (root.left == null && root.right == null)) return root;

        helper(root.left, root.right);

        return root;
    }

    private static void helper(Node left, Node right) {
        if (left == null || right == null) return;
        left.next = right;
        helper(left.left, left.right);
        helper(left.right, right.left);
        helper(right.left, right.right);
    }

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}