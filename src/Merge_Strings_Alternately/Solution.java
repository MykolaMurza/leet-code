package Merge_Strings_Alternately;

class Solution {
    public static void main(String[] args) {
        System.out.println(
                mergeAlternately("ab", "pqrs")
        );

        System.out.println(
                mergeAlternately("abcd", "pq")
        );
    }

    public static String mergeAlternately(String word1, String word2) {
        int smallerWordLength = Math.min(word1.length(), word2.length());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < smallerWordLength; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if (smallerWordLength < word1.length()) {
            sb.append(word1.substring(smallerWordLength));
        } else if (smallerWordLength < word2.length()) {
            sb.append(word2.substring(smallerWordLength));
        }

        return sb.toString();
    }
}