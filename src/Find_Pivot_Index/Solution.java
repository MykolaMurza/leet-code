package Find_Pivot_Index;

public class Solution {
    public static void main(String[] args) {
        System.out.println(
                pivotIndex(new int[]{1, 7, 3, 6, 5, 6})
        );
        System.out.println(
                pivotIndex(new int[]{1, 2, 3})
        );
        System.out.println(
                pivotIndex(new int[]{2, 1, -1})
        );
        System.out.println(
                pivotIndex(new int[]{-1, 1, 2})
        );
    }

    public static int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length + 1];
        int[] rightSum = new int[nums.length + 1];

        int leftSumAccumulator = 0;
        int rightSumAccumulator = 0;
        for (int i = 1; i <= nums.length; i++) {
            leftSumAccumulator += nums[i - 1];
            rightSumAccumulator += nums[nums.length - i];

            leftSum[i] = leftSumAccumulator;
            rightSum[nums.length - i] = rightSumAccumulator;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (leftSum[i] == rightSum[i + 1]) {
                return i;
            }
        }

        return leftSum[nums.length - 1] == 0 ? nums.length - 1 : -1;
    }
}
