package Permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
        System.out.println(permute(new int[]{0, 1}));
        System.out.println(permute(new int[]{1}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(result, new ArrayList<>(), nums);

        return result;
    }

    private static void backtrack(List<List<Integer>> result, ArrayList<Integer> temp, int[] nums) {
        if (temp.size() != nums.length) {
            for (int num : nums) {
                if (temp.contains(num)) continue;
                temp.add(num);
                backtrack(result, temp, nums);
                temp.remove(temp.size() - 1);
            }
        } else result.add(new ArrayList<>(temp));
    }
}
