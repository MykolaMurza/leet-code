package Is_Subsequence;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc")); // true
        System.out.println(isSubsequence("axc", "ahbgdc")); // false
        System.out.println(isSubsequence("adc", "abdbc")); // true
        System.out.println(isSubsequence("adc", "abbdc")); // true
        System.out.println(isSubsequence("adc", "adbbc")); // true
        System.out.println(isSubsequence("adc", "abbcd")); // false
        System.out.println(isSubsequence("", "abbcd")); // true
        System.out.println(isSubsequence("adc", "")); // false
        System.out.println(isSubsequence("", "")); // true
        System.out.println(isSubsequence("abbc", "ahbdc")); // false
    }

    public static boolean isSubsequence(String s, String t) {
        char[] sArr = s.toCharArray(), tArr = t.toCharArray();
        if (sArr.length == 0) return true;
        if (tArr.length == 0 || sArr.length > tArr.length) return false;

        int j = 0;
        for (int i = 0; i < tArr.length && j < sArr.length; i++) {
            if (tArr[i] == sArr[j]) j++;
        }

        return j == sArr.length;
    }
}
