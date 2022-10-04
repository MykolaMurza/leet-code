package Sqrt_X;

public class Solution {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(144));
    }

    public static int mySqrt(int x) {
        long r = x;
        while (r * r > x) {
            long epsilon = x / r;
            r = (r + epsilon) / 2;
        }

        return (int) r;
    }
}
