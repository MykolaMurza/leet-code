package Permutation_in_String;

public class Solution {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
        System.out.println(checkInclusion("ab", "eidboaoo"));
        System.out.println(checkInclusion("aaabbbccc", "abc"));
        System.out.println(checkInclusion("ab", "ab"));
    }

    public static boolean checkInclusion(String s2, String s1) {
        char[] cs1 = s1.toCharArray();
        char[] cs2 = s2.toCharArray();
        char[] s1Map = new char[26];
        char[] s2Map = new char[26];
        int windowStart = 0;
        int s2Size = s2.length();

        for (int i = 0; i < s2Size; i++) {
            s2Map[cs2[i] - 'a']++;
        }

        for (int windowEnd = 0; windowEnd < s1.length(); windowEnd++) {
            s1Map[cs1[windowEnd] - 'a']++;
            if (windowEnd - windowStart + 1 == s2Size) {
                if (checkIfWindowContainsS2(s1Map, s2Map)) {
                    return true;
                }
            }
            while (windowEnd - windowStart + 1 >= s2Size) {
                s1Map[cs1[windowStart] - 'a']--;
                windowStart++;
            }
        }

        return false;
    }


    public static boolean checkIfWindowContainsS2(char[] s1, char[] s2) {
        for (int i = 0; i < 26; i++) {
            if (s1[i] != s2[i]) {
                return false;
            }
        }

        return true;
    }

//    public static boolean checkInclusion(String s1, String s2) {
//        // Calculate hash of s1.
//        char[] s1Chars = s1.toCharArray();
//        Arrays.sort(s1Chars);
//        int hash = Arrays.hashCode(s1Chars);
//
//        char[] s2Chars = s2.toCharArray();
//        for (int i = s2Chars.length - 1; i >= s1.length() - 1; i--) {
//            // Find correct window and calculate hash.
//            char[] toCheck = new char[s1.length()];
//            for (int j = 0; j < s1.length(); j++) {
//                toCheck[j] = s2Chars[i - j];
//            }
//            Arrays.sort(toCheck);
//            if (Arrays.hashCode(toCheck) == hash) return true;
//        }
//
//        return false;
//    }
}
