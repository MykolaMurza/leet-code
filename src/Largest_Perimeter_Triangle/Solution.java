package Largest_Perimeter_Triangle;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(largestPerimeter(new int[]{2, 1, 2}));
        System.out.println(largestPerimeter(new int[]{1, 2, 1}));
        System.out.println(largestPerimeter(new int[]{3, 2, 3, 4}));
    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        for (int i = nums.length - 1; i > 1; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                sum = nums[i] + nums[i - 1] + nums[i - 2];
                break;
            }
        }

        return sum;
    }
}
