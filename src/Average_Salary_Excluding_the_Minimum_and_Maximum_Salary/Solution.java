package Average_Salary_Excluding_the_Minimum_and_Maximum_Salary;

public class Solution {
    public static void main(String[] args) {
        System.out.println(average(new int[]{4000, 3000, 1000, 2000}));
    }

    public static double average(int[] salary) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;

        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
        }

        return (double) (sum - max - min) / (salary.length - 2);
    }
}
