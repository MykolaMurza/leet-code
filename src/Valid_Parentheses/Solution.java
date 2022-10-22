package Valid_Parentheses;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        List<Character> stack = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '(', '{', '[':
                    stack.add(0, chars[i]);
                    break;
                case ')':
                    if (checkChar(stack, '(')) return false;
                    break;
                case '}':
                    if (checkChar(stack, '{')) return false;
                    break;
                case ']':
                    if (checkChar(stack, '[')) return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean checkChar(List<Character> stack, char given) {
        if (stack.isEmpty()) return true;
        Character c = stack.remove(0);

        return c != given;
    }
}
