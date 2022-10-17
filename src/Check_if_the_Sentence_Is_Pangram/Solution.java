package Check_if_the_Sentence_Is_Pangram;

public class Solution {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram("leetcode"));
    }

    public static boolean checkIfPangram(String sentence) {
        for (int i = 0; i < 26; i++) {
            if (sentence.indexOf((char) ('a' + i)) == -1) return false;
        }

        return true;
    }
}
