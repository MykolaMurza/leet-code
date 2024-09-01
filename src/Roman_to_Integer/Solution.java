package Roman_to_Integer;

public class Solution {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("XLCD"));
    }

    // Better speed
    public static int romanToInt(String s) {
        int[] numbers = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M' -> numbers[i] = 1000;
                case 'D' -> numbers[i] = 500;
                case 'C' -> numbers[i] = 100;
                case 'L' -> numbers[i] = 50;
                case 'X' -> numbers[i] = 10;
                case 'V' -> numbers[i] = 5;
                default -> numbers[i] = 1;
            }
        }

        int result = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                result += numbers[i];
                break;
            }
            if (numbers[i] > numbers[i - 1]) {
                result += numbers[i] - numbers[i - 1];
                i--;
            } else {
                result += numbers[i];
            }
        }

        return result;
    }

    // Better memory
    public static int romanToInt_Old(String s) {
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
