package Plus_One;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(plusOne(new int[]{0})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOne(new int[]{1, 9, 9, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 8, 9})));
    }

    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return digits;
        }

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
            if (i == 0) {
                // Recreate array and add 1 to the beginning, if this is the last element
                // e.g.: [9, 9, 9] -> [1, 0, 0, 0]
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;
                return newDigits;
            }
        }

        return digits;
    }
}
