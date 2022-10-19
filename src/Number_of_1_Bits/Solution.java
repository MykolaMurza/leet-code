package Number_of_1_Bits;

public class Solution {
    public static void main(String[] args) {
        System.out.println(hammingWeight(0b00000000000000000000000000001011));
        System.out.println(hammingWeight(0b00000000000000000000000010000000));
        System.out.println(hammingWeight(0b11111111111111111111111111111101));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) count++;
            n = n >>> 1;
        }

        return count;
    }
}
