package Reverse_Vowels_of_a_String;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int lo = 0, hi = chars.length - 1;
        while (lo < hi) {
            if (isVowel(chars[lo]) && isVowel(chars[hi])) {
                char temp = chars[lo];
                chars[lo] = chars[hi];
                chars[hi] = temp;
                lo++;
                hi--;
                continue;
            }

            if (!isVowel(chars[lo])) lo++;
            if (!isVowel(chars[hi])) hi--;
        }

        return new String(chars);
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
                || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }
}
