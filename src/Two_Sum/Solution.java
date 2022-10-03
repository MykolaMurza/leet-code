package Two_Sum;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.equals(twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1}));
        System.out.println(Arrays.equals(twoSum(new int[]{3, 2, 4}, 6), new int[]{1, 2}));
        System.out.println(Arrays.equals(twoSum(new int[]{3, 3}, 6), new int[]{0, 1}));
        System.out.println(Arrays.equals(twoSum(new int[]{2, 5, 5, 11}, 10), new int[]{1, 2}));
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length > 2) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }

        return new int[]{0, 1};
    }
}
