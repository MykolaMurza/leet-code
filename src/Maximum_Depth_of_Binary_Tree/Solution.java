package Maximum_Depth_of_Binary_Tree;

public class Solution {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int[] counter = new int[1];
        dfs(root, 1, counter);

        return counter[0];
    }

    private void dfs(TreeNode node, int step, int[] counter) {
        if (node.left == null && node.right == null && counter[0] < step) counter[0] = step;
        else {
            step++;
            if (node.left != null) dfs(node.left, step, counter);
            if (node.right != null) dfs(node.right, step, counter);
        }
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
