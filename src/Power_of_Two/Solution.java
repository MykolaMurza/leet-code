package Power_of_Two;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(1024));
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(10));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n % 2 != 0) return false;

        while (n > 2) {
            n = n >> 1;
            if (n % 2 != 0) return false;
        }

        return n / 2 == 1;
    }
}
