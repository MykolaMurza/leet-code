package Length_of_Last_Word;

public class Solution {
    private static final char SPACE_CHARACTER = ' ';

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s) {
        int nonSpaceChars = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != SPACE_CHARACTER) {
                nonSpaceChars++;
            } else if (nonSpaceChars != 0) {
                break;
            }
        }
        return nonSpaceChars;
    }

    public static int lengthOfLastWord_Old(String s) {
        String trimmerString = s.trim();

        return trimmerString.length() - trimmerString.lastIndexOf(' ') - 1;
    }
}
