package Triangle;

import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n + 1][n + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                Integer elem = triangle.get(i).get(j);
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + elem;
            }
        }

        return dp[0][0];
    }
}
