package Increasing_Triplet_Subsequence;

public class Solution {
    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        System.out.println(increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        System.out.println(increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
        System.out.println(increasingTriplet(new int[]{20, 100, 10, 12, 5, 13}));
        System.out.println(increasingTriplet(new int[]{1, 1, 1, 1, 1}));
        System.out.println(increasingTriplet(new int[]{1, 2, 1}));
    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;
        int firstMinValue = Integer.MAX_VALUE;
        int secondMinValue = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= firstMinValue) {
                firstMinValue = num;
            } else if (num <= secondMinValue) {
                secondMinValue = num;
            } else {
                return true;
            }
        }

        return false;
    }
}
