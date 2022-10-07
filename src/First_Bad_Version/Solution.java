package First_Bad_Version;

public class Solution {
    public static void main(String[] args) {

    }

    public static int firstBadVersion(int n) {
        int low = 1, high = n, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static boolean isBadVersion(int i) {
        return i == 2;
    }
}
