package Break_a_Palindrome;

public class Solution {
    public static void main(String[] args) {
        System.out.println(breakPalindrome("abccba"));
        System.out.println(breakPalindrome("aaaa"));
        System.out.println(breakPalindrome("bbb"));
        System.out.println(breakPalindrome("b"));
    }

    public static String breakPalindrome(String palindrome) {
        if (palindrome.length() == 1) return "";

        char[] chars = palindrome.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != 'a') {
                chars[i] = 'a';
                return new String(chars);
            }
        }

        chars[chars.length - 1] = 'b';
        return new String(chars);
    }
}
