package Integer_to_Roman;

public class Solution {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(20));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1904));
        System.out.println(intToRoman(1994));
        System.out.println(intToRoman(2500));
        System.out.println(intToRoman(9999));
    }

    public static String intToRoman(int num) {
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] digits = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder result = new StringBuilder();

        while (num > 0) {
            for (int i = 0; i < digits.length; i++) {
                if (num % digits[i] < num || num == digits[i]) {
                    result.append(symbols[i]);
                    num -= digits[i];
                    break;
                }
            }
        }

        return result.toString();
    }
}
