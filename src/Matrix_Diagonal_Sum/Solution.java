package Matrix_Diagonal_Sum;

public class Solution {
    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})); // 25
        System.out.println(diagonalSum(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}})); // 8
        System.out.println(diagonalSum(new int[][]{{5}})); // 5
    }

    public static int diagonalSum(int[][] mat) {
        int result = 0;

        for (int i = 0; i < mat.length; i++) {
            if (i == mat.length - 1 - i) {
                result += mat[i][i];
            } else {
                result += mat[i][i] + mat[i][mat.length - 1 - i];
            }
        }

        return result;
    }
}
