package Single_Number;

public class Solution {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1}));
        System.out.println(singleNumber(new int[]{1, 2, 2, 1, 3, 4, 3}));
    }

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }

        return res;
    }
}
