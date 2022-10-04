package Decode_Ways;

import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(numDecodings("12")); // 2
        System.out.println(numDecodings("226")); // 3
        System.out.println(numDecodings("06")); // 0
        System.out.println(numDecodings("106")); // 1
        System.out.println(numDecodings("10")); // 1
        System.out.println(numDecodings("1201234")); // 3
    }

    static Set<String> valid = Set.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
            "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26");

    public static int numDecodings(String s) {
        return 0;
    }
}
