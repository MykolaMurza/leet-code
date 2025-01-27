package Kth_Largest_Element_in_an_Array;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }

    public static int findKthLargest(int[] nums, int k) {
        int[] map = new int[21];

        for (int i = 0; i < nums.length; i++) {
            map[nums[i] + 10]++;
        }

        for (int i = 20; k > 0; i--) {
            if (map[i] > 0) {
                if (k == 1) {
                    return i - 10;
                }
                if (map[i] > 0) {
                    k -= map[i];
                }
            }
        }

        return 0;
    }

//    public static int findKthLargest(int[] nums, int k) {
//        int valueSE = 10000, indexSE = 0;
//        int[] heap = new int[k];
//
//        for (int i = 0; i < k; i++) {
//            heap[i] = nums[i];
//            if (valueSE > nums[i]) {
//                valueSE = nums[i];
//                indexSE = i;
//            }
//        }
//
//        for (int i = k; i < nums.length; i++) {
//            if (valueSE < nums[i]) {
//                heap[indexSE] = nums[i];
//                valueSE = heap[0];
//                for (int j = 0; j < heap.length; j++) {
//                    if (valueSE >= heap[j]) {
//                        valueSE = heap[j];
//                        indexSE = j;
//                    }
//                }
//            }
//        }
//
//        return valueSE;
//    }
}
