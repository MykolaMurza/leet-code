package Missing_Ranges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        if (nums.length == 0) {
            return List.of(List.of(lower, upper));
        }

        List<List<Integer>> ranges = new ArrayList<>();
        if (lower < nums[0]) {
            ranges.add(List.of(lower, nums[0] - 1));
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 < nums[i + 1]) {
                ranges.add(List.of(nums[i] + 1, nums[i + 1] - 1));
            }
        }

        if (nums[nums.length - 1] < upper) {
            ranges.add(List.of(nums[nums.length - 1] + 1, upper));
        }

        return ranges;
    }
}
