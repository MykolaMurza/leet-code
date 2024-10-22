package Invert_Binary_Tree;

public class Solution {
    public static void main(String[] args) {
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode tmpLeft = root.left;
        root.left = root.right;
        root.right = tmpLeft;

        invertTree(root.left);
        invertTree(root.right);

        return root;
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