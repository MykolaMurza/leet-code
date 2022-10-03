package Richest_Customer_Wealth;

public class Solution {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {3, 2, 1}};
        int[][] arr2 = {{1, 5}, {7, 3}, {3, 5}};
        int[][] arr3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(maximumWealth(arr1));
        System.out.println(maximumWealth(arr2));
        System.out.println(maximumWealth(arr3));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int tmp = 0;
            for (int i : account) {
                tmp += i;
            }
            if (tmp > max) max = tmp;
        }

        return max;
    }
}
