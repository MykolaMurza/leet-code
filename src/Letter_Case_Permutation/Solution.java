package Letter_Case_Permutation;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(letterCasePermutation("a1b2"));
    }

    private static final List<String> res = new ArrayList<>();

    public static List<String> letterCasePermutation(String s) {
        backtrack(s.toCharArray(), 0);
        return res;
    }

    public static void backtrack(char[] string, int index) {
        if (string.length == index) {
            res.add(new String(string));
            return;
        }

        if (Character.isLetter(string[index])) {
            if (Character.isUpperCase(string[index])) {
                string[index] = Character.toLowerCase(string[index]);
                backtrack(string, index + 1);
                string[index] = Character.toUpperCase(string[index]);
            } else {
                string[index] = Character.toUpperCase(string[index]);
                backtrack(string, index + 1);
                string[index] = Character.toLowerCase(string[index]);
            }
        }

        backtrack(string, index + 1);
    }
}
