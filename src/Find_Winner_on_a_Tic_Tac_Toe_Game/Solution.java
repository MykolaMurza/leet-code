package Find_Winner_on_a_Tic_Tac_Toe_Game;

public class Solution {
    public static void main(String[] args) {
        System.out.println(tictactoe(new int[][]{{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}})); // A
        System.out.println(tictactoe(new int[][]{{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}})); // B
        System.out.println(tictactoe(new int[][]{{0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1}, {0, 1}, {0, 2}, {2, 2}})); // Draw
        System.out.println(tictactoe(new int[][]{{2, 2}, {1, 2}, {2, 1}, {1, 1}, {2, 0}})); // A

    }

    public static String tictactoe(int[][] moves) {
        char[][] table = new char[3][3];

        char player = 'A';
        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];
            table[row][col] = player;
            player = player == 'A' ? 'B' : 'A';
        }

        for (int i = 0; i < 3; i++) {
            if (table[i][0] == table[i][1] && table[i][1] == table[i][2]
                    && (table[i][0] == 'A' || table[i][0] == 'B')) {
                return String.valueOf(table[i][0]);
            }
        }

        for (int i = 0; i < 3; i++) {
            if (table[0][i] == table[1][i] && table[1][i] == table[2][i]
                    && (table[0][i] == 'A' || table[0][i] == 'B')) {
                return String.valueOf(table[0][i]);
            }
        }

        if (table[0][0] == table[1][1] && table[1][1] == table[2][2]
                && (table[0][0] == 'A' || table[0][0] == 'B')) {
            return String.valueOf(table[0][0]);
        }

        if (table[0][2] == table[1][1] && table[1][1] == table[2][0]
                && (table[0][2] == 'A' || table[0][2] == 'B')) {
            return String.valueOf(table[0][2]);
        }

        return moves.length != 9 ? "Pending" : "Draw";
    }
}
