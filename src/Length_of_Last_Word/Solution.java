package Length_of_Last_Word;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s) {
        String trimmerString = s.trim();

        return trimmerString.length() - trimmerString.lastIndexOf(' ') - 1;
    }
}
