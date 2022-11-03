package Combinations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> comb = new LinkedList<>();

        combine(res, comb, n, k, 1);

        return res;
    }

    private static void combine(List<List<Integer>> res, LinkedList<Integer> comb, int n, int k, int i) {
        if (comb.size() == k) res.add(new ArrayList<>(comb));

        for (int j = i; j <= n && comb.size() < k; j++) {
            comb.add(j);
            combine(res, comb, n, k, j + 1);
            comb.removeLast();
        }
    }
}
