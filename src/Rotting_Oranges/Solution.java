package Rotting_Oranges;

public class Solution {
    public static void main(String[] args) {
        System.out.println(orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}})); // 4
        System.out.println(orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}})); // -1
        System.out.println(orangesRotting(new int[][]{{0, 2}})); // 0
        System.out.println(orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 1}, {0, 1, 2}})); // 2
        System.out.println(orangesRotting(new int[][]{{2, 2}, {1, 0}})); // 1
    }

    public static int orangesRotting(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) dfs(grid, i, j, -1, new int[1]);
            }
        }

        int maxMinutes = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int elem = grid[i][j];
                if (elem == 1) return -1;
                else if (elem < 0) maxMinutes = Math.min(elem, maxMinutes);
            }
        }

        return maxMinutes == 0 ? 0 : -maxMinutes - 1;
    }

    private static int dfs(int[][] grid, int i, int j, int nextMin, int[] memo) {
        grid[i][j] = nextMin; // rotten-stepped
        if (memo[0] > nextMin) memo[0] = nextMin;

        nextMin--;
        if (i < grid.length - 1 && (grid[i + 1][j] == 1 || grid[i + 1][j] < nextMin))
            dfs(grid, i + 1, j, nextMin, memo);

        if (i > 0 && (grid[i - 1][j] == 1 || grid[i - 1][j] < nextMin))
            dfs(grid, i - 1, j, nextMin, memo);

        if (j < grid[i].length - 1 && (grid[i][j + 1] == 1 || grid[i][j + 1] < nextMin))
            dfs(grid, i, j + 1, nextMin, memo);

        if (j > 0 && (grid[i][j - 1] == 1 || grid[i][j - 1] < nextMin))
            dfs(grid, i, j - 1, nextMin, memo);

        return memo[0];
    }
}
