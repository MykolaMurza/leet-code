package Reverse_String;

public class Solution {
    public static void main(String[] args) {
        char[] hello = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(hello);
        System.out.println(hello);
    }

    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
