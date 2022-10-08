package Rotate_Array;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(arr1, 3);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[]{-1, -100, 3, 99};
        rotate(arr2, 2);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[]{1, 2, 3};
        rotate(arr3, 4);
        System.out.println(Arrays.toString(arr3));
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
