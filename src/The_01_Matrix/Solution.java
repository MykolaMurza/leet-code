package The_01_Matrix;

public class Solution {
    public static void main(String[] args) {

    }

    public static int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] memo = new int[m][n];
        int range = m * n;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    memo[i][j] = 0;
                } else {
                    int upCell = (i > 0) ? memo[i - 1][j] : range;
                    int leftCell = (j > 0) ? memo[i][j - 1] : range;
                    memo[i][j] = Math.min(upCell, leftCell) + 1;
                }
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (mat[i][j] == 0) {
                    memo[i][j] = 0;
                } else {
                    int downCell = (i < m - 1) ? memo[i + 1][j] : range;
                    int rightCell = (j < n - 1) ? memo[i][j + 1] : range;
                    memo[i][j] = Math.min(Math.min(downCell, rightCell) + 1, memo[i][j]);
                }
            }
        }

        return memo;
    }
}
