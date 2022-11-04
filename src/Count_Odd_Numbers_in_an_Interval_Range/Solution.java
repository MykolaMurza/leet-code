package Count_Odd_Numbers_in_an_Interval_Range;

public class Solution {
    public static void main(String[] args) {
        System.out.println(countOdds(3, 7));
        System.out.println(countOdds(2, 10));
        System.out.println(countOdds(8, 10));
    }

    public static int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
