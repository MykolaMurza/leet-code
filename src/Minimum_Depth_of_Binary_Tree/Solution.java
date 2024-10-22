package Minimum_Depth_of_Binary_Tree;

public class Solution {
    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int leftVal = minDepth(root.left);
        int rightVal = minDepth(root.right);

        if (leftVal == 0) {
            return rightVal + 1;
        } else if (rightVal == 0) {
            return leftVal + 1;
        }

        return Math.min(leftVal, rightVal) + 1;
    }

    public class TreeNode {
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
}
