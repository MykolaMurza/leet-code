package Jump_Game;

public class Solution {
    public boolean canJump(int[] nums) {
        int remain = 0;

        for (int i = 0; i < nums.length; i++) {
            remain = Math.max(remain, nums[i]);
            if (nums.length - 1 - i <= remain) {
                return true;
            }

            if (nums[i] == 0 && remain == 0) {
                return false;
            }
            remain--;
        }

        return false;
    }
}
