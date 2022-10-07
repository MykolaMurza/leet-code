package Binary_Search;

public class Solution {
    public static void main(String[] args) {
        int[] array = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(array, 9));
        System.out.println(search(array, 2));
    }

    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] > target) high = mid - 1;
            else if (nums[mid] < target) low = mid + 1;
            else return mid;
        }

        return -1;
    }
}
