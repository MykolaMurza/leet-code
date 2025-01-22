package Decode_String;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
        System.out.println(decodeString("abc3[a]2[bc]abc"));
    }

    public static String decodeString(String s) {
        char[] input = s.toCharArray();
        StringBuilder[] parts = new StringBuilder[input.length];
        int writer = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] >= '0' && input[i] <= '9') {
                if (i > 0 && input[i - 1] >= 'a' && input[i - 1] <= 'z') {
                    writer++;
                }
                parts[writer] = checkAndAppend(parts[writer], input[i]);
            } else if (input[i] == '[') {
                writer++;
                parts[writer] = checkAndAppend(parts[writer], '[');
            } else if (input[i] == ']') {
                parts[writer] = checkAndAppend(parts[writer], ']');
                writer++;
            } else {
                parts[writer] = checkAndAppend(parts[writer], input[i]);
            }
        }

        if (parts[writer] == null) {
            writer--;
        }

        System.out.println(Arrays.toString(parts));

        StringBuilder result = concatResult(writer, parts);

        return result.toString();
    }

    private static StringBuilder checkAndAppend(StringBuilder sb, char element) {
        if (sb == null) {
            sb = new StringBuilder();
        }
        sb.append(element);
        return sb;
    }

    private static StringBuilder concatResult(int writer, StringBuilder[] parts) {
        StringBuilder result = new StringBuilder();
        int iterationsCount = 1;

        for (int j = 0; j <= writer; j++) {
            String element = parts[j].toString();
            if (element.charAt(0) >= '0' && element.charAt(0) <= '9' ) {
                iterationsCount = Integer.parseInt(parts[j].toString());
            } else if (element.charAt(0) == '[') {
                element = element.substring(1, element.length() - 1);
                result.append(element.repeat(iterationsCount));
            } else {
                result.append(element);
            }
        }

        return result;
    }
}