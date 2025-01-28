package Decode_String;

class Solution {
    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]")); // aaa-bcbc
        System.out.println(decodeString("abc3[a]2[bc]abc")); // abc-aaa-bcbc-abc
        System.out.println(decodeString("3[a2[b]a]2[bc]")); // abba-abba-abba-bcbc
        System.out.println(decodeString("3[a2[b]a]2[bc]a2[b]a")); // abba-abba-abba-bcbc-a-bb-a
        System.out.println(decodeString("3[3[3[a]]]")); // aaa-aaa-aaa-aaa-aaa-aaa-aaa-aaa-aaa
    }

    public static String decodeString(String s) {
        char[] input = s.toCharArray();
        StringBuilder[] parts = new StringBuilder[input.length];
        int writer = 0;

        int openings = 0;
        for (int i = 0; i < input.length; i++) {
//            System.out.println(input[i] + " : ops " + openings);
            if (input[i] >= '0' && input[i] <= '9') {
                if (i > 0 && input[i - 1] >= 'a' && input[i - 1] <= 'z' && openings == 0) {
                    writer++;
                }
                parts[writer] = checkAndAppend(parts[writer], input[i]);
            } else if (input[i] == '[') {
                if (openings == 0) {
                    writer++;
                }
                openings++;
                parts[writer] = checkAndAppend(parts[writer], '[');
            } else if (input[i] == ']') {
                openings--;
                parts[writer] = checkAndAppend(parts[writer], ']');
                if (openings == 0) {
                    writer++;
                }
            } else {
                parts[writer] = checkAndAppend(parts[writer], input[i]);
            }
        }

        if (parts[writer] == null) {
            writer--;
        }

//        System.out.println(Arrays.toString(parts));

        String result = concatResult(writer, parts).toString();
        if (result.contains("[")) {
            return decodeString(result);
        }

        return result;
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
            if (element.charAt(0) >= '0' && element.charAt(0) <= '9') {
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