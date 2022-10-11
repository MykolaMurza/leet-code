package Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;

public class Solution_II {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("bbbbb")); // 1
        System.out.println(lengthOfLongestSubstring("pwwkew")); // 3
        System.out.println(lengthOfLongestSubstring(" ")); // 1
        System.out.println(lengthOfLongestSubstring("au")); // 2
    }

    public static int lengthOfLongestSubstring(String s) {
        int slow = 0, fast = 0, max = 0;
        HashSet<Character> table = new HashSet<>();
        while (fast < s.length()) {
            if (!table.contains(s.charAt(fast))) {
                table.add(s.charAt(fast));
                fast++;
                max = Math.max(table.size(), max);
            } else {
                table.remove(s.charAt(slow));
                slow++;
            }
        }

        return max;
    }
}
