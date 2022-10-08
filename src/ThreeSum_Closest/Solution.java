package ThreeSum_Closest;

public class Solution {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1, 2, 1, -4}, 3));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int leastSum = nums[0] + nums[1] + nums[2];
        if (nums.length == 3) return leastSum;

        sortArray(nums);
        int size = nums.length;

        for (int i = 0; i < size - 2; i++) {
            //todo
        }

        return leastSum;
    }

    private static void sortArray(int[] nums) {
        if (nums.length < 2) return;

        int[] arrA = new int[nums.length / 2];
        System.arraycopy(nums, 0, arrA, 0, nums.length / 2);

        int[] arrB = new int[nums.length - arrA.length];
        System.arraycopy(nums, arrA.length, arrB, 0, nums.length - arrA.length);

        sortArray(arrA);
        sortArray(arrB);

        mergeArray(nums, arrA, arrB);
    }

    private static void mergeArray(int[] nums, int[] arrA, int[] arrB) {
        int posA = 0, posB = 0;

        for (int c = 0; c < nums.length; c++) {
            if (posA == arrA.length) {
                nums[c] = arrB[posB];
                posB++;
            } else if (posB == arrB.length) {
                nums[c] = arrA[posA];
                posA++;
            } else if (arrA[posA] < arrB[posB]) {
                nums[c] = arrA[posA];
                posA++;
            } else {
                nums[c] = arrB[posB];
                posB++;
            }
        }
    }
}
