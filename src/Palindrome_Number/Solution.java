package Palindrome_Number;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(12221));
        System.out.println(!isPalindrome(-121));
        System.out.println(!isPalindrome(10));
        System.out.println(!isPalindrome(123));
        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;

        int result = 0, memory = x;
        while (x > 0) {
            result = result * 10 + (x % 10);
            x /= 10;
        }

        return result == memory;
    }
}
