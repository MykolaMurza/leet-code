package Find_if_Path_Exists_in_Graph;

public class Solution {
    public static void main(String[] args) {
        System.out.println(validPath(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2));
        System.out.println(validPath(4, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 0}}, 0, 2));
        System.out.println(validPath(6, new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}}, 0, 5));
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        UF uf = new UF(n);
        for (int[] edge : edges) {
            uf.union(edge[0], edge[1]);
        }

        return uf.isConnected(source, destination);
    }

    public static class UF {
        int[] elements;
        int[] size;

        public UF(int n) {
            elements = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                elements[i] = i;
            }
        }

        public void union(int p, int q) {
            int pRoot = root(p);
            int qRoot = root(q);
            if (pRoot == qRoot) return;
            if (size[pRoot] < size[qRoot]) {
                elements[pRoot] = qRoot;
                size[qRoot] += size[pRoot];
            } else {
                elements[qRoot] = pRoot;
                size[pRoot] += size[qRoot];
            }
        }

        public boolean isConnected(int p, int q) {
            return root(p) == root(q);
        }

        private int root(int i) {
            while (elements[i] != i) {
                elements[i] = elements[elements[i]];
                i = elements[i];
            }
            return i;
        }
    }
}
