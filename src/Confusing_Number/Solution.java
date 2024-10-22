package Confusing_Number;

public class Solution {
    public static void main(String[] args) {

    }

    public boolean confusingNumber(int n) {
        char[] digits = String.valueOf(n).toCharArray();

        int front = 0, back = digits.length - 1;
        while (front <= back) {
            char frontDigit = rotateSelfDigit(digits[front]);
            if (frontDigit == 'e') {
                return false;
            }

            if (front == back) {
                digits[front] = frontDigit;
                break;
            }

            char backDigit = rotateSelfDigit(digits[back]);
            if (backDigit == 'e') {
                return false;
            }

            digits[front] = backDigit;
            digits[back] = frontDigit;

            front++;
            back--;
        }

        int finalNumber = Integer.parseInt(String.valueOf(digits));

        return n != finalNumber;
    }

    private char rotateSelfDigit(char digit) {
        if (digit == '2' || digit == '3' || digit == '4' || digit == '5' || digit == '7') {
            return 'e';
        } else if (digit == '6') {
            return '9';
        } else if (digit == '9') {
            return '6';
        }

        return digit;
    }
}
