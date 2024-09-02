package Robot_Return_to_Origin;

public class Solution {
    public static void main(String[] args) {
        System.out.println(judgeCircle("UD")); // true
        System.out.println(judgeCircle("LL")); // false
    }

    public static boolean judgeCircle(String moves) {
        char[] movesArr = moves.toCharArray();
        int x = 0, y = 0;
        for (int i = 0; i < movesArr.length; i++) {
            if (movesArr[i] == 'U') y++;
            else if (movesArr[i] == 'D') y--;
            else if (movesArr[i] == 'R') x++;
            else x--;
        }

        return (x | y) == 0;
    }
}
