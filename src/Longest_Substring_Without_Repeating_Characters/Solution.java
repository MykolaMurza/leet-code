package Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("bbbbb")); // 1
        System.out.println(lengthOfLongestSubstring("pwwkew")); // 3
        System.out.println(lengthOfLongestSubstring(" ")); // 1
        System.out.println(lengthOfLongestSubstring("au")); // 2
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;

        int max = 0;
        char[] characters = s.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            Set<Character> table = new HashSet<>();
            table.add(characters[i]);
            for (int j = i + 1; j < characters.length; j++) {
                if (!table.contains(characters[j])) {
                    table.add(characters[j]);
                } else break;
            }
            if (max < table.size()) max = table.size();
        }

        return max;
    }
}
