package _Sort.Insertion_Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement Insertion Sort and return intermediate states.
 * <p>
 * Insertion Sort is a simple sorting algorithm that builds the sorted list one element at
 * a time, from left to right. It works by repeatedly taking an element from the unsorted
 * portion and inserting it into its correct position in the sorted portion of the list.
 * <p>
 * Objective:
 * <p>
 * Given a list of key-value pairs, sort the list by key using Insertion Sort. Return a list of
 * lists showing the state of the array after each insertion. If two key-value pairs have the same key,
 * maintain their relative order in the sorted list.
 * <p>
 * Input:
 * <p>
 * pairs - a list of key-value pairs, where each key-value has an integer key and a string value.
 * (0 <= pairs.length <= 100).
 */
public class Solution {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(5, 4, 3, 2, 10, 101, 6, 5, 25));
        insertionSort(arr);
        System.out.println(arr);
    }

    public static List<List<Integer>> insertionSort(List<Integer> arr) {
        List<List<Integer>> res = new ArrayList<>();
        if (arr.isEmpty()) {
            return res;
        }

        for (int i = 1; i < arr.size(); i++) {
            int j = i;
            while (j > 0 && arr.get(j) < arr.get(j - 1)) {
                int tmp = arr.get(j - 1);
                arr.set(j - 1, arr.get(j));
                arr.set(j, tmp);
                j--;
            }
            res.add(new ArrayList<>(arr));
        }

        return res;
    }
}
