package _Sort.Quick_Sort;

import java.util.Arrays;


public class Solution {
    public static void main(String[] args) {
        int[] arr1 = new int[]{5, 4, 3, 2, 10, 101, 6, 5, 25};
//        int[] arr1 = new int[]{5, 1, 1, 2, 0, 0};
//        int[] arr1 = new int[]{4, 2, 5, 1, 3};
        quickSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = arr[end];
        int left = start;

        for (int i = start; i < end; i++) {
            int num = arr[i];
            if (num < pivot) {
                arr[i] = arr[left];
                arr[left] = num;
                left++;
            }
        }
        arr[end] = arr[left];
        arr[left] = pivot;

        quickSort(arr, start, left - 1);
        quickSort(arr, left + 1, end);
    }
}
