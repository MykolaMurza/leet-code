package Squares_of_a_Sorted_Array;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7, -3, 2, 3, 11})));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int front = 0, back = nums.length - 1, index = back;

        while (index >= 0) {
            int fSqr = nums[front] * nums[front];
            int bSqr = nums[back] * nums[back];

            if (fSqr > bSqr) {
                result[index--] = fSqr;
                front++;
            } else {
                result[index--] = bSqr;
                back--;
            }
        }

        return result;
    }
}
