package Move_Zeroes;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 1, 0, 3, 12};
        moveZeroes(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[]{0};
        moveZeroes(arr2);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[]{0, 1, 0, 3, 0, 12, 0, -124, 124124, 12};
        moveZeroes(arr3);
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = new int[]{0, 0, 1};
        moveZeroes(arr4);
        System.out.println(Arrays.toString(arr4));
        int[] arr5 = new int[]{0, 0};
        moveZeroes(arr5);
        System.out.println(Arrays.toString(arr5));
    }

    public static void moveZeroes(int[] nums) {
        if (nums.length == 1) return;
        int count = 0, size = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }

        while (count < size) {
            nums[count] = 0;
            count++;
        }
    }
}
