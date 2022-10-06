package Find_if_Path_Exists_in_Graph;

public class Solution {
    public static void main(String[] args) {
        System.out.println(validPath(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2));
        System.out.println(validPath(6, new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}}, 0, 5));
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true;
        //todo

        return false;
    }
}
