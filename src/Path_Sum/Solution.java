package Path_Sum;

public class Solution {
    public static void main(String[] args) {

    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        return pathFinder(root, 0, targetSum);
    }

    private static boolean pathFinder(TreeNode root, int sum, final int targetSum) {
        boolean fl = false;
        boolean fr = false;

        sum += root.val;
        if (sum == targetSum && root.left == null && root.right == null) return true;
        else {
            if (root.left != null) fl = pathFinder(root.left, sum, targetSum);
            if (root.right != null) fr = pathFinder(root.right, sum, targetSum);
        }

        return fl || fr;
    }

    public static class TreeNode {
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