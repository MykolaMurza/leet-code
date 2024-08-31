package Sign_of_the_Product_of_an_Array;

public class Solution {
    public static void main(String[] args) {
        System.out.println(arraySign(new int[]{-1, -2, -3, -4, 3, 2, 1})); // 1
        System.out.println(arraySign(new int[]{1, 5, 0, 2, -3})); // 0
        System.out.println(arraySign(new int[]{-1, 1, -1, 1, -1})); // -1
    }

    public static int arraySign(int[] nums) {
        int minusCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                minusCount++;
            }
            if (nums[i] == 0) {
                return 0;
            }
        }

        return minusCount % 2 == 0 ? 1 : -1;
    }
}
