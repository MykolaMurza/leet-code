package Maximum_69_Number;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maximum69Number(9699));
        System.out.println(maximum69Number(9669));
        System.out.println(maximum69Number(6666));
        System.out.println(maximum69Number(9999));
    }

    public static int maximum69Number(int num) {
        int[] nums = new int[5];
        int i = 0;
        while (num != 0) {
            nums[i] = num % 10;
            num /= 10;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            if (nums[j] == 6) {
                nums[j] = 9;
                break;
            }
        }

        int res = 0;
        for (int j = i - 1; j >= 0; j--) {
            res = res * 10 + nums[j];
        }

        return res;
    }
}
