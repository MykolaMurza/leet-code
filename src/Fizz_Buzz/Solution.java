package Fizz_Buzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean d3 = i % 3 == 0, d5 = i % 5 == 0;
            if (!d3 && !d5) {
                res.add("" + i);
            } else if (d3 && d5) {
                res.add("FizzBuzz");
            } else if (d3) {
                res.add("Fizz");
            } else res.add("Buzz");
        }

        return res;
    }
}
