package Reverse_Words_in_a_String_III;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("God Ding"));
    }

    public static String reverseWords(String s) {
        int index = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                reverse(c, index, i - 1);
                index = i + 1;
            }
        }

        reverse(c, index, c.length - 1);

        return new String(c);
    }

    private static void reverse(char[] c, int index, int i) {
        while (index < i) {
            char temp = c[index];
            c[index] = c[i];
            c[i] = temp;
            index++;
            i--;
        }
    }
}
