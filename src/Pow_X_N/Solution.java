package Pow_X_N;

public class Solution {
    public static void main(String[] args) {
        System.out.println(myPow(2, 10));
        System.out.println(myPow(2.1, 3));
        System.out.println(myPow(2, -2));
        System.out.println(myPow(0.00001, 2147483647));
    }

    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        double result = myPow(x, n / 2);

        if (n % 2 == 0) {
            return result * result;
        } else {
            if (n > 0) return result * result * x;
            else return (result * result) / x;
        }
    }
}
