package Subtract_the_Product_and_Sum_of_Digits_of_an_Integer;

public class Solution {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(4421));
        System.out.println(subtractProductAndSum(705));
        System.out.println(subtractProductAndSum(690));
    }

    public static int subtractProductAndSum(int n) {
        int prevMul = 1, prevSum = 0;

        while (n != 0) {
            int val = n % 10;
            prevSum += val;
            prevMul *= val;
            n /= 10;
        }

        return prevMul - prevSum;
    }
}
