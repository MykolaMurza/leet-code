package Contains_Duplicate_II;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i]) && Math.abs(hash.get(nums[i]) - i) <= k) return true;
            else hash.put(nums[i], i);
        }

        return false;
    }
}
