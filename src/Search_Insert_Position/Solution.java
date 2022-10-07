package Search_Insert_Position;

public class Solution {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 0));
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else return mid;
        }

        return low;
    }
}
