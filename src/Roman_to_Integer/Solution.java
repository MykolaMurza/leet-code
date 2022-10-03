package Roman_to_Integer;

public class Solution {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("XLCD"));
    }

    public static int romanToInt(String s) {
        int memory = 0, result = 0;
        char[] symbols = s.toCharArray();

        for (int i = symbols.length - 1; i >= 0; i--) {
            char symbol = symbols[i];
            int digit;

            if (symbol == 'I') digit = 1;
            else if (symbol == 'V') digit = 5;
            else if (symbol == 'X') digit = 10;
            else if (symbol == 'L') digit = 50;
            else if (symbol == 'C') digit = 100;
            else if (symbol == 'D') digit = 500;
            else digit = 1000;

            if (digit < memory) result -= digit;
            else result += digit;
            memory = digit;
        }

        return result;
    }
}
