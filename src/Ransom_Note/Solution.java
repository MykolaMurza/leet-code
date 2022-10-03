package Ransom_Note;

public class Solution {
    public static void main(String[] args) {
        System.out.println(!canConstruct("a", "b"));
        System.out.println(!canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
        System.out.println(canConstruct("aab", "baa"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] next = new int[32];
        char curr;
        int index;

        for (int i = 0; i < ransomNote.length(); i++) {
            curr = ransomNote.charAt(i);
            index = magazine.indexOf(curr, next[curr - 97]);
            if (index == -1) return false;
            next[curr - 97] = ++index;
        }

        return true;
    }
}
