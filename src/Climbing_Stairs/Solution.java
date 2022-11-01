package Climbing_Stairs;

public class Solution {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        int res = 0, f1 = 0, f2 = 1;

        if (n <= 3) return n;
        n++;
        while (n > 1) {
            res = f1 + f2;
            f1 = f2;
            f2 = res;
            n--;
        }

        return res;
    }
}
