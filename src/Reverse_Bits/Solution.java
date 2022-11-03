package Reverse_Bits;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseBits(0b00000010100101000001111010011100));
        System.out.println(reverseBits(0b11111111111111111111111111111101));
    }

    public static int reverseBits(int n) {
        int ans = 0;

        for (int i = 0; i <= 31; i++) {
            int bit = n & 1;
            bit <<= 31 - i;
            ans = ans | bit;
            n >>= 1;
        }

        return ans;
    }
}
