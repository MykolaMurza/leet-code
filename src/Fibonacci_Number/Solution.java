package Fibonacci_Number;

public class Solution {
    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(fib(10));
        System.out.println(fib(30));
        System.out.println(fib(46));
    }

    public static int fib(int n) {
        int res = 0, f1 = 0, f2 = 1;

        if (n <= 1) return n;
        while (n > 1) {
            res = f1 + f2;
            f1 = f2;
            f2 = res;
            n--;
        }

        return res;
    }
}
