package Longest_ZigZag_Path_in_a_Binary_Tree;

public class Solution {
    public static void main(String[] args) {

    }

    private int max = 0;

    public int longestZigZag(TreeNode root) {
        traverseZigZag(root.right, Direction.LEFT, 0);
        traverseZigZag(root.left, Direction.RIGHT, 0);
        return max;
    }

    private void traverseZigZag(TreeNode node, Direction nextDir, int depth) {
        depth++;
        if (nextDir == Direction.RIGHT) {
            if (node.right == null) {
                max = Math.max(max, depth);
            } else {
                traverseZigZag(node.right, Direction.LEFT, depth);
            }
            if (node.left != null) {
                traverseZigZag(node.left, Direction.RIGHT, 0);
            }
        } else if (nextDir == Direction.LEFT) {
            if (node.left == null) {
                max = Math.max(max, depth);
            } else {
                traverseZigZag(node.left, Direction.RIGHT, depth);
            }
            if (node.right != null) {
                traverseZigZag(node.right, Direction.LEFT, 0);
            }
        }
    }

    private enum Direction {
        LEFT,
        RIGHT;
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
