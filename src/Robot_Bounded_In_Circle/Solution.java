package Robot_Bounded_In_Circle;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isRobotBounded("GGLLGG")); // true
        System.out.println(isRobotBounded("GG")); // false
        System.out.println(isRobotBounded("GL")); // true
        System.out.println(isRobotBounded("RGGGLGLLLLGLRGRLGGRLLRRRL")); // true
    }

    public static boolean isRobotBounded(String instructions) {
        char[] moves = instructions.toCharArray();
        int x = 0, y = 0;

        //   N
        // W * E
        //   S
        char[] direction = new char[]{'N', 'E', 'S', 'W'};
        int view = 0;

        for (int i = 0; i < moves.length; i++) {
            if (moves[i] == 'L') {
                view--;
                if (view == -1) view = 3;
            } else if (moves[i] == 'R') {
                view++;
                if (view == 4) view = 0;
            } else {
                if (direction[view] == 'N') x++;
                else if (direction[view] == 'E') y++;
                else if (direction[view] == 'S') x--;
                else if (direction[view] == 'W') y--;
            }
        }

        return view != 0 || (x | y) == 0;
    }
}
