package _Sort.Merge_Sort;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        int[] arr1 = new int[]{5, 4, 3, 2, 10, 101, 6, 5, 25};
        int[] arr1 = new int[]{};
//        int[] arr1 = new int[]{5, 1, 1, 2, 0, 0, 10};
        mergeSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int middle = start + (end - start) / 2;
        mergeSort(arr, start, middle);
        mergeSort(arr, middle + 1, end);

        merge(arr, start, middle, end);
    }

    private static void merge(int[] arr, int start, int middle, int end) {
        int l = start, r = middle + 1, p = 0, length = end - start + 1;
        int[] merged = new int[length];

        while (l <= middle && r <= end) {
            if (arr[l] <= arr[r]) {
                merged[p] = arr[l];
                l++;
            } else {
                merged[p] = arr[r];
                r++;
            }
            p++;
        }

        while (l <= middle) {
            merged[p] = arr[l];
            l++;
            p++;
        }
        while (r <= end) {
            merged[p] = arr[r];
            r++;
            p++;
        }

        for (int i = start, j = 0; i <= end; i++, j++) {
            arr[i] = merged[j];
        }
    }
}
