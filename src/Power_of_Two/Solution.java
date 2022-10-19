package Power_of_Two;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1)); // true
        System.out.println(isPowerOfTwo(4)); // true
        System.out.println(isPowerOfTwo(16)); // true
        System.out.println(isPowerOfTwo(1024)); // true
        System.out.println(isPowerOfTwo(0)); // false
        System.out.println(isPowerOfTwo(3)); // false
        System.out.println(isPowerOfTwo(10)); // false
        System.out.println(isPowerOfTwo(-2147483648)); // false
    }

    public static boolean isPowerOfTwo(int n) {
        if (n > 0) return false;

        return (n & (n - 1)) == 0;
    }
}
