package Remove_Duplicates_from_Sorted_Array;

public class Solution {
    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;

        int counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[counter] = nums[i];
                counter++;
            }
        }

        return counter;
    }
}
