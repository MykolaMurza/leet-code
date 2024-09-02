package Average_Salary_Excluding_the_Minimum_and_Maximum_Salary;

public class Solution {
    public static void main(String[] args) {
        System.out.println(average(new int[]{4000, 3000, 1000, 2000}));
        System.out.println(average(new int[]{1000, 2000, 3000}));
    }

    public static double average(int[] salary) {
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < salary.length; i++) {
            int currentEmployeeSalary = salary[i];
            if (currentEmployeeSalary > max) {
                max = currentEmployeeSalary;
            }

            if (currentEmployeeSalary < min) {
                min = currentEmployeeSalary;
            }

            sum += currentEmployeeSalary;
        }

        return (double) (sum - max - min) / (salary.length - 2);
    }
}
