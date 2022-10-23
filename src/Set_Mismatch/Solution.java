package Set_Mismatch;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 2, 4})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 1})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{2, 2})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 5, 3, 2, 2, 7, 6, 4, 8, 9})));
    }

    public static int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length + 1];
        int duplicateNum = 0, absentNum = 0;
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 2)
                duplicateNum = i;
            if (arr[i] == 0)
                absentNum = i;
        }

        return new int[]{duplicateNum, absentNum};
    }

//    public int[] findErrorNums(int[] nums) {
//        Map<Integer, Integer> hash = new HashMap<>();
//        int duplicateNum = 1, absentNum = 2;
//        for (int i = 0; i < nums.length; i++) {
//            hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
//        }
//
//        for (int i = 0; i <= hash.size(); i++) {
//            if (hash.getOrDefault(nums[i], 0) == 2)
//                duplicateNum = nums[i];
//            if (hash.getOrDefault(i + 1, 0) == 0)
//                absentNum = i + 1;
//        }
//
//        return new int[]{duplicateNum, absentNum};
//    }
}
