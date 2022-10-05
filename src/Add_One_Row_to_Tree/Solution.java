package Add_One_Row_to_Tree;

public class Solution {
    public static void main(String[] args) {

    }

    public static TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            root = new TreeNode(val, root, null);
            return root;
        }

        stepTree(root, val, depth);

        return root;
    }

    private static void stepTree(TreeNode root, int val, int depth) {
        depth -= 1;
        if (depth == 1) {
            if (root.left != null) {
                root.left = new TreeNode(val, root.left, null);
            } else root.left = new TreeNode(val);
            if (root.right != null) {
                root.right = new TreeNode(val, null, root.right);
            } else root.right = new TreeNode(val);
        } else if (depth > 1) {
            if (root.right != null) stepTree(root.right, val, depth);
            if (root.left != null) stepTree(root.left, val, depth);
        }
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
