package Binary_Tree_Inorder_Traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        if (root.left == null && root.right == null) return List.of(root.val);

        List<Integer> ints = new ArrayList<>();
        traverse(root, ints);

        return ints;
    }

    private void traverse(TreeNode node, List<Integer> ints) {
        if (node.left != null) traverse(node.left, ints);
        ints.add(node.val);
        if (node.right != null) traverse(node.right, ints);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
