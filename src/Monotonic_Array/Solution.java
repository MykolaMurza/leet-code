package Monotonic_Array;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1, 2, 2, 3})); // true
        System.out.println(isMonotonic(new int[]{6, 5, 4, 4})); // true
        System.out.println(isMonotonic(new int[]{1, 3, 2})); // false
        System.out.println(isMonotonic(new int[]{1, 1, 0})); // true
        System.out.println(isMonotonic(new int[]{1, 1, 1})); // true
    }

    public static boolean isMonotonic(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        // Check on increase/decrease and get index of the first previously-non-equal value
        boolean isIncreasing = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                isIncreasing = nums[i] > nums[i - 1];
            }
        }

        // Validate values in array
        for (int i = 1; i < nums.length; i++) {
            if (isIncreasing && nums[i] < nums[i - 1]) {
                return false;
            } else if (!isIncreasing && nums[i] > nums[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
