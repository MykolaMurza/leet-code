package House_Robber;

public class Solution {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1, 2, 3, 1}));
        System.out.println(rob(new int[]{2, 7, 9, 3, 1}));
        System.out.println(rob(new int[]{2, 1, 3, 10}));
    }


    // Input: 2 1 3 10
    // Cycle step: 1  -  2  -  3  -  4
    // stolen:     2     1     5     12
    // notStolen:  0     2     2     5
    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int stolen = 0, notStolen = 0;
        for (int i = 0; i < nums.length; i++) {
            int curr = notStolen + nums[i];
            notStolen = Math.max(notStolen, stolen);
            stolen = curr;
        }

        return Math.max(stolen, notStolen);
    }
}
