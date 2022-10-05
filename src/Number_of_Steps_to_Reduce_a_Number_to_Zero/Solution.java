package Number_of_Steps_to_Reduce_a_Number_to_Zero;

public class Solution {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14)); // 6
    }

    public static int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) num /= 2;
            else num--;
            steps++;
        }

        return steps;
    }
}
