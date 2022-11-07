package Find_Nearest_Point_That_Has_the_Same_X_or_Y_Coordinate;

public class Solution {
    public static void main(String[] args) {
        System.out.println(nearestValidPoint(3, 4, new int[][]{{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}}));
        System.out.println(nearestValidPoint(3, 4, new int[][]{{3, 4}}));
        System.out.println(nearestValidPoint(3, 4, new int[][]{{2, 3}}));
        System.out.println(nearestValidPoint(58, 7837, new int[][]{{8205, 8862}}));
    }

    public static int nearestValidPoint(int x, int y, int[][] points) {
        int smallestIndex = -1, smallestDistance = Integer.MAX_VALUE;

        for (int i = 0; i < points.length; i++) {
            if (x == points[i][0] || y == points[i][1]) {
                int dist = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (dist < smallestDistance) {
                    smallestDistance = dist;
                    smallestIndex = i;
                }
            }
        }

        return smallestIndex;
    }
}
